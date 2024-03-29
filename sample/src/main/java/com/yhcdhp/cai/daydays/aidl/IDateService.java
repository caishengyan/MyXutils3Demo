/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\Users\\caishengyan\\Desktop\\baidu_ditu_location\\IPCDemo\\app\\src\\main\\aidl\\com\\jiyoutang\\ipcdemo\\IDateService.aidl
 */
package com.yhcdhp.cai.daydays.aidl;

// Declare any non-default types here with import statements

public interface IDateService extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements IDateService {
        private static final String DESCRIPTOR = "com.jiyoutang.ipcdemo.IDateService";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.jiyoutang.ipcdemo.IDateService interface,
         * generating a proxy if needed.
         */
        public static IDateService asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof IDateService))) {
                return ((IDateService) iin);
            }
            return new IDateService.Stub.Proxy(obj);
        }

        @Override
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
            switch (code) {
                case INTERFACE_TRANSACTION: {
                    reply.writeString(DESCRIPTOR);
                    return true;
                }
                case TRANSACTION_getDate: {
                    data.enforceInterface(DESCRIPTOR);
                    String _result = this.getDate();
                    reply.writeNoException();
                    reply.writeString(_result);
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements IDateService {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder remote) {
                mRemote = remote;
            }

            @Override
            public android.os.IBinder asBinder() {
                return mRemote;
            }

            public String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            @Override
            public String getDate() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                String _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getDate, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
        }

        static final int TRANSACTION_getDate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    }

    public String getDate() throws android.os.RemoteException;
}
