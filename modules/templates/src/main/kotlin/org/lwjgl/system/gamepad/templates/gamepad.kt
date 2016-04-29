/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.gamepad.templates

import org.lwjgl.generator.*
import org.lwjgl.system.gamepad.*

val gamepad = "Gamepad".nativeClass(GAMEPAD_PACKAGE, prefixMethod = "Gamepad_") {
	nativeDirective(
		"""DISABLE_WARNINGS()
#include "gamepad/Gamepad.h"
ENABLE_WARNINGS()

typedef void (Gamepad_deviceAttachCallback)(struct Gamepad_device * device, void * context);
typedef void (Gamepad_deviceRemoveCallback)(struct Gamepad_device * device, void * context);
typedef void (Gamepad_buttonDownCallback)(struct Gamepad_device * device, unsigned int buttonID, double timestamp, void * context);
typedef void (Gamepad_buttonUpCallback)(struct Gamepad_device * device, unsigned int buttonID, double timestamp, void * context);
typedef void (Gamepad_axisMoveCallback)(struct Gamepad_device * device, unsigned int axisID, float value, float lastValue, double timestamp, void * context);"""
	)

	documentation =
		"""
		Native bindings to \"Gamepad.h\".

		Gamepad provides a low-level interface for USB game controller input. Each element on an attached game controller is mapped to zero or more buttons and
		zero or more axes. Buttons are binary controls; axes are continuous values ranging from -1.0f to 1.0f. The presence and ordering of elements depends on
		the platform and driver.

		Typical usage: Register a callback to notify you when a new device is attached with #deviceAttachFunc(), then call #init() and #detectDevices(). Your
		callback will be called once per connected game controller. Also register callbacks for button and axis events with #buttonDownFunc(), #buttonUpFunc(),
		and #axisMoveFunc(). Call #processEvents() every frame, and #detectDevices() occasionally to be notified of new devices that were plugged in after your
		#init() call. If you're interested in knowing when a device was disconnected, you can call #deviceRemoveFunc() get be notified of it.
		"""


	void(
		"init",
		"""
		Initializes gamepad library and detects initial devices. Call this before any other {@code Gamepad_*()} function, other than callback registration
		functions. If you want to receive {@code deviceAttachFunc} callbacks from devices detected in {@code Gamepad_init()}, you must call #deviceAttachFunc()
		before calling #init().

		This function must be called from the same thread that will be calling #processEvents() and #detectDevices().
		"""
	)

	void(
		"shutdown",
		"""
		Tears down all data structures created by the gamepad library and releases any memory that was allocated. It is not necessary to call this function at
		application termination, but it's provided in case you want to free memory associated with gamepads at some earlier time.
		"""
	)

	unsigned_int(
		"numDevices",
		"Returns the number of currently attached gamepad devices."
	)

	Gamepad_device_p(
		"deviceAtIndex",
		"Returns the specified {@code Gamepad_device} struct, or $NULL if {@code deviceIndex} is out of bounds.",

		unsigned_int.IN("deviceIndex", "the device index")
	)

	void(
		"detectDevices",
		"""
		Polls for any devices that have been attached since the last call to #detectDevices() or #init(). If any new devices are found, the callback registered
		with #deviceAttachFunc() (if any) will be called once per newly detected device.

		Note that depending on implementation, you may receive button and axis event callbacks for devices that have not yet been detected with
		#detectDevices(). You can safely ignore these events, but be aware that your callbacks might receive a device ID that hasn't been seen by your
		{@code deviceAttachFunc}.
		"""
	)

	void(
		"processEvents",
		"Reads pending input from all attached devices and calls the appropriate input callbacks, if any have been registered."
	)

	val context = nullable..voidptr.IN("context", "a context pointer that will be passed to all {@code callback} invocations")

	void(
		"deviceAttachFunc",
		"""
		Registers a function to be called whenever a device is attached. The specified function will be called only during calls to #init() and
		#detectDevices(), in the thread from which those functions were called. Calling this function with a $NULL argument will stop any previously registered
		callback from being called subsequently.
        """,

		nullable..Gamepad_deviceAttachCallback.IN("callback", "the callback function"),
		context
	)

	void(
		"deviceRemoveFunc",
		"""
		Registers a function to be called whenever a device is detached. The specified function can be called at any time, and will not necessarily be called
		from the main thread. Calling this function with a $NULL argument will stop any previously registered callback from being called subsequently.
		""",

		nullable..Gamepad_deviceRemoveCallback.IN("callback", "the callback function"),
		context
	)

	void(
		"buttonDownFunc",
		"""
		Registers a function to be called whenever a button on any attached device is pressed. The specified function will be called only during calls to
		#processEvents(), in the thread from which #processEvents() was called. Calling this function with a $NULL argument will stop any previously registered
		callback from being called subsequently.
        """,

		nullable..Gamepad_buttonDownCallback.IN("callback", "the callback function"),
		context
	)

	void(
		"buttonUpFunc",
		"""
		Registers a function to be called whenever a button on any attached device is released. The specified function will be called only during calls to
		#processEvents(), in the thread from which #processEvents() was called. Calling this function with a $NULL argument will stop any previously registered
		callback from being called subsequently.
		""",

		nullable..Gamepad_buttonUpCallback.IN("callback", "the callback function"),
		context
	)

	void(
		"axisMoveFunc",
		"""
		Registers a function to be called whenever an axis on any attached device is moved. The specified function will be called only during calls to
		#processEvents(), in the thread from which #processEvents() was called. Calling this function with a $NULL argument will stop any previously registered
		callback from being called subsequently.
		""",

		nullable..Gamepad_axisMoveCallback.IN("callback", "the callback function"),
		context
	)
}