/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.*;


/**
 * Native bindings to libSystem, the MacOS system library.
 * 
 * <p>This class contains no functionality and is only responsible for loading the system library. Other libraries (contained in libSystem) reuse the library
 * handle loaded by this class.</p>
 */
public final class LibSystem {

    private LibSystem() {
        throw new UnsupportedOperationException();
    }

    private static final SharedLibrary SYSTEM = Library.loadNative(LibSystem.class, "org.lwjgl", "System");

    /** Returns the System {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return SYSTEM;
    }

}