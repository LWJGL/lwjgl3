/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_multi_bind = "ARBMultiBind".nativeClassGL("ARB_multi_bind") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides a new set of commands allowing applications to bind or unbind a set of objects in a single call, instead of requiring a separate
		call for each bind or unbind operation.  Using a single command allows OpenGL implementations to amortize function call, name space lookup, and
		potential locking overhead over multiple bind or unbind operations. The rendering loops of graphics applications frequently switch between different
		states, binding different sets of resources, including texture objects, sampler objects, textures for image loads and stores, uniform buffers, and
		vertex buffers; this extension provides "multi-bind" entry points for all of these object types.

		Each command in this extension includes a &lt;first&gt; and &lt;count&gt; parameter, specifying a continguous range of binding points to update, as well
		as an array of &lt;count&gt; object names specifying the objects to bind. Unlike single bind commands, multi-bind commands can be used only to bind or
		unbind existing objects. Passing a previously unused object name (generated or not) results in an error and does not create a new object. For binding
		points with associated data (e.g., ranges of a buffer), separate arrays are used to pass the associated data for each binding point. Passing zero values
		in the array of object names removes the object bound to the current bounding point. Additionally, if $NULL is passed as the array of objects, objects
		bound to the entire range of binding points are unbound, as though the caller passed an array of zeroes.

		Requires ${GL30.core}. ${GL44.promoted}
		"""

	GL44 reuse "BindBuffersBase"
	GL44 reuse "BindBuffersRange"
	GL44 reuse "BindTextures"
	GL44 reuse "BindSamplers"
	GL44 reuse "BindImageTextures"
	GL44 reuse "BindVertexBuffers"
}