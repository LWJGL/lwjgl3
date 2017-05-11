/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.tinyfd

import org.lwjgl.generator.*

val TinyFD_PACKAGE = "org.lwjgl.util.tinyfd"
val TinyFD_LIBRARY = """Library.loadSystem(System::load, System::loadLibrary, TinyFileDialogs.class, Platform.mapLibraryNameBundled("lwjgl_tinyfd"));
        tinyfd_winUtf8().put(0, 1);"""

fun config() {
    packageInfo(
        TinyFD_PACKAGE,
        """
        Contains bindings to ${url("https://sourceforge.net/projects/tinyfiledialogs/", "tiny file dialogs")}.
        """
    )
}

