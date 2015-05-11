/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_SOFT_direct_channels = "SOFTDirectChannels".nativeClassAL("SOFT_direct_channels") {
	documentation =
		"""
		Native bindings to the $specLinkOpenALSoft extension.

		This extension allows a multi-channel source to play without virtualized output speakers. By default, OpenAL requires buffer channels to be down-mixed
		to the output channel configuration, possibly using HRTF or other virtualization techniques to give a sense of speakers that may not be physically
		present. Sometimes audio tracks are authored with their own spatialization effects, where the AL's virtualization methods can cause a notable decrease
		in audio quality.

		This extension provides a mechanism for applications to specify whether audio should be filtered according to the AL's channel virtualization rules for
		multi-channel buffers.
		"""

	IntConstant(
		"Accepted by the {@code paramName} parameter of alSourcei, alSourceiv, alGetSourcei, and alGetSourceiv.",

		"DIRECT_CHANNELS_SOFT" _ 0x1033
	)
}