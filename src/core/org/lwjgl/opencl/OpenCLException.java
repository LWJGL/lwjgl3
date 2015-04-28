/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

/**
 * A runtime exception thrown by LWJGL when it encounters an OpenCL error. The
 * checks that trigger this exception are only enabled when
 * {@link org.lwjgl.LWJGLUtil#DEBUG} is true.
 */
public class OpenCLException extends RuntimeException {

        /**
         * The serialVersionUID is a universal version identifier for a Serializable
         * class.
         */
        private static final long serialVersionUID = 1L;

        /**
         * Default constructor for <code>OpenCLException</code>.
         */
        public OpenCLException() {
            super();
        }

        /**
         * Constructor for OpenCLException. Constructs an instance of
         * <code>OpenCLException</code> with the specified detail message.
         *
         * @param message the detail message.
         */
        public OpenCLException(String message) {
            super(message);
        }

        /**
         * Constructor for OpenCLException. Constructs an instance of
         * <code>OpenCLException</code> with the specified detail message and cause.
         *
         * @param message String identifier for exception
         * @param cause the cause of the exception
         */
        public OpenCLException(String message, Throwable cause) {
            super(message, cause);
        }

        /**
         * Constructor for OpenCLException. Constructs an instance of
         * <code>OpenCLException</code> with the specified cause.
         *
         * @param cause the cause of the exception
         */
        public OpenCLException(Throwable cause) {
            super(cause);
        }
}

