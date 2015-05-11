/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_SOFT_deferred_updates = "SOFTDeferredUpdates".nativeClassAL("SOFT_deferred_updates") {
	nativeImport (
		"OpenAL.h"
	)

	documentation =
		"""
		Native bindings to the $specLinkOpenALSoft extension.

		This extension allows applications to defer playback state updates. With unextended OpenAL, the playback state would respond to changes as soon as it
		could handle them, which makes it effectively impossible to ensure multiple changes occur at the same time without the potential of a "partial" update
		(where one change is heard without the other). This extension provides a way to prevent state updates from occuring until they've all been done, where
		they will all apply at once.
		"""

	IntConstant(
		"Accepted by the {@code paramName} parameter of alGetBoolean, alGetBooleanv (as well as the Integer, Float, and Double variants).",

		"DEFERRED_UPDATES_SOFT" _ 0xC002
	)

	ALvoid(
		"DeferUpdatesSOFT",
		"""
		Sometimes it is desirable to ensure multiple state changes take effect at the same time. Normally this isn't possible due to the AL processing updates
		asychronously, so the playback state can be updated with only part of the changes having been specified. An application can prevent these updates by
		calling this function.

		When called, samples will continue to render and be sent to the output device, but the effects of changing playback properties, such as the source or
		listener gain, or auxiliary slot gain or effect if EFX is supported, among others, will be deferred. Multiple changes can be batched so that they all
		apply at once at a later time.
		"""
	)

	ALvoid(
		"ProcessUpdatesSOFT",
		"""
		Resumes updates.

		Once called, all pending deferred updates will be processed. Any following state changes will also apply as normal.
		"""
	)
}