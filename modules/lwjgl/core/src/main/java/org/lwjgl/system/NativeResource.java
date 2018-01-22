/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

/**
 * Classes that implement this interface are associated with one or more native resources. These resources must be explicitly freed when a class instance is
 * no longer used, by calling the {@link #free} method.
 *
 * <p>This interface extends {@link AutoCloseable}, which means that implementations may be used as resources in try-with-resources statements.</p>
 */
public interface NativeResource extends AutoCloseable {

    /** Frees any native resources held by this object. */
    void free();

    @Override
    default void close() {
        free();
    }

}