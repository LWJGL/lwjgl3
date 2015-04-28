/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal;

/**
 * A runtime exception thrown by LWJGL when it encounters an OpenAL error. The
 * checks that trigger this exception are only enabled when
 * {@link org.lwjgl.LWJGLUtil#DEBUG} is true.
 */
public class OpenALException extends RuntimeException {

        /**
         * The serialVersionUID is a universal version identifier for a Serializable
         * class.
         */
        private static final long serialVersionUID = 1L;

        /**
         * Default constructor for <code>OpenALException</code>.
         */
        public OpenALException() {
            super();
        }

        /**
         * Constructor for OpenALException. Constructs an instance of
         * <code>OpenALException</code> with the specified detail message.
         *
         * @param message the detail message.
         */
        public OpenALException(String message) {
            super(message);
        }

        /**
         * Constructor for OpenALException. Constructs an instance of
         * <code>OpenALException</code> with the specified detail message and cause.
         *
         * @param message String identifier for exception
         * @param cause the cause of the exception
         */
        public OpenALException(String message, Throwable cause) {
            super(message, cause);
        }

        /**
         * Constructor for OpenALException. Constructs an instance of
         * <code>OpenALException</code> with the specified cause.
         *
         * @param cause the cause of the exception
         */
        public OpenALException(Throwable cause) {
            super(cause);
        }
}

