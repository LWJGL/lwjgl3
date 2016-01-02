/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.nfd

import org.lwjgl.generator.*

val NFD_PACKAGE = "org.lwjgl.nfd"

fun config() {
	packageInfo(
		NFD_PACKAGE,
		"""
		Contains bindings to <a href="https://github.com/mlabbe/nativefiledialog">Native File Dialog</a>, a tiny, neat C library that portably invokes native
		file open and save dialogs. Write dialog code once and have it popup native dialogs on all
		"""
	)
}

val nfdchar_t = CharType("nfdchar_t", CharMapping.UTF8)
val nfdchar_t_p = CharSequenceType(nfdchar_t)
val nfdchar_t_pp = nfdchar_t_p.p

val nfdpathset_t_p = struct_p(NFD_PACKAGE, "NFDPathSet", nativeName = "nfdpathset_t", mutable = false, nativeLayout = true) {
	nativeImport("nfd.h")
	documentation = "An opaque data structure to be used with NativeFileDialog##NFD_OpenDialogMultiple()."
}

val nfdresult_t = typedef(int, "nfdresult_t")

