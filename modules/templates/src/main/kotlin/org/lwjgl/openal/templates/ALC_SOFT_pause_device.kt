/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val ALC_SOFT_pause_device = "SOFTPauseDevice".nativeClassALC("SOFT_pause_device") {
	nativeImport (
		"OpenAL.h"
	)

	documentation =
		"""
		Native bindings to the $specLinkOpenALSoft extension.

		This extension allows applications to pause a playback device. The main purpose of this is to silence output, stop processing, and allow the audio
		hardware to go into a low-power mode. On a mobile device, for instance, apps may want to silence output and not waste battery life with unneeded
		processing when in the background.
		"""

	ALCvoid(
		"DevicePauseSOFT",
		"""
		Pauses a playback device.

		When paused, no contexts associated with the device will be processed or updated. Playing sources will not produce sound, have their offsets
		incremented, or process any more buffers, until the device is resumed. Pausing a device that is already paused is a legal no-op.
		""",

		ALCdevice_p.IN("device", "the device to pause")
	)

	ALCvoid(
		"DeviceResumeSOFT",
		"""
		Resumes playback of a paused device.

		This will restart processing on the device -- sources will resume playing sound as normal. Resuming playback on a device that is not paused is a legal
		no-op.

		These functions are not reference counted. alcDeviceResumeSOFT only needs to be called once to resume playback, regardless of how many times
		#DevicePauseSOFT() was called.
		""",

		ALCdevice_p.IN("device", "the device to resume")
	)
}