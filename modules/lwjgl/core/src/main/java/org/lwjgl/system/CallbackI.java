/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

/**
 * <p>Base interface for dynamically created native functions that call into Java code. Pointers to such functions can be passed to native APIs as callbacks.</p>
 *
 * <p>This interface does not define a callback method, therefore it should not be implemented directly. The following inner interfaces should be used instead:</p>
 * <ul>
 * <li>{@link V}</li>
 * <li>{@link Z}</li>
 * <li>{@link B}</li>
 * <li>{@link S}</li>
 * <li>{@link I}</li>
 * <li>{@link J}</li>
 * <li>{@link F}</li>
 * <li>{@link D}</li>
 * <li>{@link P}</li>
 * </ul>
 */
public interface CallbackI extends Pointer {

    /**
     * Returns the dyncall signature for this callback function. [INTERNAL API]
     *
     * @return the dyncall signature
     */
    String getSignature();

    @Override
    default long address() {
        return Callback.create(getSignature(), this);
    }

    /** A {@code Callback} with no return value. */
    interface V extends CallbackI {
        /**
         * Will be called by native code.
         *
         * @param args pointer to a {@code DCArgs} iterator
         */
        void callback(long args);
    }

    /** A {@code Callback} that returns a boolean value. */
    interface Z extends CallbackI {
        /**
         * Will be called by native code.
         *
         * @param args pointer to a {@code DCArgs} iterator
         *
         * @return the value to store to the result {@code DCValue}
         */
        boolean callback(long args);
    }

    /** A {@code Callback} that returns a byte value. */
    interface B extends CallbackI {
        /**
         * Will be called by native code.
         *
         * @param args pointer to a {@code DCArgs} iterator
         *
         * @return the value to store to the result {@code DCValue}
         */
        byte callback(long args);
    }

    /** A {@code Callback} that returns a short value. */
    interface S extends CallbackI {
        /**
         * Will be called by native code.
         *
         * @param args pointer to a {@code DCArgs} iterator
         *
         * @return the value to store to the result {@code DCValue}
         */
        short callback(long args);
    }

    /** A {@code Callback} that returns an int value. */
    interface I extends CallbackI {
        /**
         * Will be called by native code.
         *
         * @param args pointer to a {@code DCArgs} iterator
         *
         * @return the value to store to the result {@code DCValue}
         */
        int callback(long args);
    }

    /** A {@code Callback} that returns a long value. */
    interface J extends CallbackI {
        /**
         * Will be called by native code.
         *
         * @param args pointer to a {@code DCArgs} iterator
         *
         * @return the value to store to the result {@code DCValue}
         */
        long callback(long args);
    }

    /** A {@code Callback} that returns a C long value. */
    interface N extends CallbackI {
        /**
         * Will be called by native code.
         *
         * @param args pointer to a {@code DCArgs} iterator
         *
         * @return the value to store to the result {@code DCValue}
         */
        long callback(long args);
    }

    /** A {@code Callback} that returns a float value. */
    interface F extends CallbackI {
        /**
         * Will be called by native code.
         *
         * @param args pointer to a {@code DCArgs} iterator
         *
         * @return the value to store to the result {@code DCValue}
         */
        float callback(long args);
    }

    /** A {@code Callback} that returns a double value. */
    interface D extends CallbackI {
        /**
         * Will be called by native code.
         *
         * @param args pointer to a {@code DCArgs} iterator
         *
         * @return the value to store to the result {@code DCValue}
         */
        double callback(long args);
    }

    /** A {@code Callback} that returns a pointer value. */
    interface P extends CallbackI {
        /**
         * Will be called by native code.
         *
         * @param args pointer to a {@code DCArgs} iterator
         *
         * @return the value to store to the result {@code DCValue}
         */
        long callback(long args);
    }

}

