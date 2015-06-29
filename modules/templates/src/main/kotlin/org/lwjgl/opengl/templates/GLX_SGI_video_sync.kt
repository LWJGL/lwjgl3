/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.linux.*

val GLX_SGI_video_sync = "GLXSGIVideoSync".nativeClassGLX("GLX_SGI_video_sync", SGI) {
	nativeImport (
		"<GL/glx.h>"
	)

	documentation =
		"""
		Native bindings to the ${registryLink("SGI", "video_sync")} extension.

		This extension provides a means for synchronization with the video frame rate of a monitor.
		"""

	GLint(
		"GetVideoSyncSGI",
		"Returns the value of the video sync counter in {@code count}. Zero is returned if the call is successful.",

		Check(1) _ unsigned_int_p.OUT("count", "the video sync counter value")
	)

	GLint(
		"WaitVideoSyncSGI",
		"""
		Puts the calling process to sleep until

		${code("(C mod D) = R")}

		where {@code C} is the video sync counter, {@code D} is specified by the {@code divisor} parameter of {@code glXWaitVideoSyncSGI}, and {@code R} is
		specified by the {@code remainder} parameter of {@code glXWaitVideoSyncSGI}. {@code glXWaitVideoSyncSGI} returns the current video sync counter value in
		{@code count}. Zero is returned by {@code glXWaitVideoSyncSGI} if it is successful.
		""",

		int.IN("divisor", "the divisor value"),
		int.IN("remainder", "the remainder value"),
		Check(1) _ unsigned_int_p.OUT("count", "the video sync counter value")
	)

}