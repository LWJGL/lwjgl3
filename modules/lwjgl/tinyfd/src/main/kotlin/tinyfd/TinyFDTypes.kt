/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package tinyfd

import org.lwjgl.generator.*

const val TinyFD_LIBRARY = """Library.loadSystem(System::load, System::loadLibrary, TinyFileDialogs.class, Platform.mapLibraryNameBundled("lwjgl_tinyfd"));
        tinyfd_winUtf8().put(0, 1);"""

fun config() {
    packageInfo(
        Module.TINYFD,
        """
        Contains bindings to ${url("https://sourceforge.net/projects/tinyfiledialogs/", "tiny file dialogs")}.
        """
    )
}

