/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.util.tinyfd

import org.lwjgl.generator.*

val TinyFD_PACKAGE = "org.lwjgl.util.tinyfd"
val TinyFD_LIBRARY = "LibTinyFD.initialize();"

fun config() {
	packageInfo(
		TinyFD_PACKAGE,
		"""
		Contains bindings to <a href="https://sourceforge.net/projects/tinyfiledialogs/">tiny file dialogs</a>.
		"""
	)

	Generator.registerLibraryInit(TinyFD_PACKAGE, "LibTinyFD", "tinyfd")
}

