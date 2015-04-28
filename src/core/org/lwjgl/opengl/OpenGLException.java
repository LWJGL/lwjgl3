/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

/**
 * A runtime exception thrown by LWJGL when it encounters an OpenGL error. The
 * checks that trigger this exception are only enabled when
 * {@link org.lwjgl.LWJGLUtil#DEBUG} is true.
 */
public class OpenGLException extends RuntimeException {

        /**
         * The serialVersionUID is a universal version identifier for a Serializable
         * class.
         */
        private static final long serialVersionUID = 1L;

        /**
         * Constructor for OpenGLException.
         *
         * @param gl_error_code
         */
        public OpenGLException(int gl_error_code) {
            this(String.format("%s [0x%X]", GLContext.translateGLErrorString(gl_error_code), gl_error_code));
        }

        /**
         * Constructor for OpenGLException.
         *
         * @param message
         */
        public OpenGLException(String message) {
            super(message);
        }

        /**
         * Constructor for OpenGLException.
         *
         * @param format
         * @param args
         */
        public OpenGLException(String format, Object... args) {
            super(String.format(format, args));
        }
}

