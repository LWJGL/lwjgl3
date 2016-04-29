/*
  Copyright (c) 2014 Alex Diener
  
  This software is provided 'as-is', without any express or implied
  warranty. In no event will the authors be held liable for any damages
  arising from the use of this software.
  
  Permission is granted to anyone to use this software for any purpose,
  including commercial applications, and to alter it and redistribute it
  freely, subject to the following restrictions:
  
  1. The origin of this software must not be misrepresented; you must not
     claim that you wrote the original software. If you use this software
     in a product, an acknowledgment in the product documentation would be
     appreciated but is not required.
  2. Altered source versions must be plainly marked as such, and must not be
     misrepresented as being the original software.
  3. This notice may not be removed or altered from any source distribution.
  
  Alex Diener alex@ludobloom.com
*/

#include "gamepad/Gamepad.h"
#include "gamepad/Gamepad_private.h"
#include <IOKit/hid/IOHIDLib.h>
#include <limits.h>
#include <mach/mach.h>
#include <mach/mach_time.h>

#define GAMEPAD_RUN_LOOP_MODE CFSTR("GamepadRunLoopMode")

struct HIDGamepadAxis {
	IOHIDElementCookie cookie;
	CFIndex logicalMin;
	CFIndex logicalMax;
	bool hasNullState;
	bool isHatSwitch;
	bool isHatSwitchSecondAxis;
};

struct HIDGamepadButton {
	IOHIDElementCookie cookie;
};

struct Gamepad_devicePrivate {
	IOHIDDeviceRef deviceRef;
	struct HIDGamepadAxis * axisElements;
	struct HIDGamepadButton * buttonElements;
};

struct Gamepad_queuedEvent {
	unsigned int deviceID;
	enum Gamepad_eventType eventType;
	void * eventData;
};

static IOHIDManagerRef hidManager = NULL;
static struct Gamepad_device ** devices = NULL;
static unsigned int numDevices = 0;
static unsigned int nextDeviceID = 0;

static struct Gamepad_queuedEvent * inputEventQueue = NULL;
static size_t inputEventQueueSize = 0;
static size_t inputEventCount = 0;

static struct Gamepad_queuedEvent * deviceEventQueue = NULL;
static size_t deviceEventQueueSize = 0;
static size_t deviceEventCount = 0;

static void hatValueToXY(CFIndex value, CFIndex range, int * outX, int * outY) {
	if (value == range) {
		*outX = *outY = 0;
		
	} else {
		if (value > 0 && value < range / 2) {
			*outX = 1;
			
		} else if (value > range / 2) {
			*outX = -1;
			
		} else {
			*outX = 0;
		}
		
		if (value > range / 4 * 3 || value < range / 4) {
			*outY = -1;
			
		} else if (value > range / 4 && value < range / 4 * 3) {
			*outY = 1;
			
		} else {
			*outY = 0;
		}
	}
}

static void queueInputEvent(unsigned int deviceID, enum Gamepad_eventType eventType, void * eventData) {
	struct Gamepad_queuedEvent queuedEvent;
	
	queuedEvent.deviceID = deviceID;
	queuedEvent.eventType = eventType;
	queuedEvent.eventData = eventData;
	
	if (inputEventCount >= inputEventQueueSize) {
		inputEventQueueSize = inputEventQueueSize == 0 ? 1 : inputEventQueueSize * 2;
		inputEventQueue = realloc(inputEventQueue, sizeof(struct Gamepad_queuedEvent) * inputEventQueueSize);
	}
	inputEventQueue[inputEventCount++] = queuedEvent;
}

static void queueAxisEvent(struct Gamepad_device * device, double timestamp, unsigned int axisID, float value, float lastValue) {
	struct Gamepad_axisEvent * axisEvent;
	
	axisEvent = malloc(sizeof(struct Gamepad_axisEvent));
	axisEvent->device = device;
	axisEvent->timestamp = timestamp;
	axisEvent->axisID = axisID;
	axisEvent->value = value;
	axisEvent->lastValue = lastValue;
	
	queueInputEvent(device->deviceID, GAMEPAD_EVENT_AXIS_MOVED, axisEvent);
}

static void queueButtonEvent(struct Gamepad_device * device, double timestamp, unsigned int buttonID, bool down) {
	struct Gamepad_buttonEvent * buttonEvent;
	
	buttonEvent = malloc(sizeof(struct Gamepad_buttonEvent));
	buttonEvent->device = device;
	buttonEvent->timestamp = timestamp;
	buttonEvent->buttonID = buttonID;
	buttonEvent->down = down;
	
	queueInputEvent(device->deviceID, down ? GAMEPAD_EVENT_BUTTON_DOWN : GAMEPAD_EVENT_BUTTON_UP, buttonEvent);
}

static void onDeviceValueChanged(void * context, IOReturn result, void * sender, IOHIDValueRef value) {
	struct Gamepad_device * deviceRecord;
	struct Gamepad_devicePrivate * hidDeviceRecord;
	IOHIDElementRef element;
	IOHIDElementCookie cookie;
	unsigned int axisIndex, buttonIndex;
	static mach_timebase_info_data_t timebaseInfo;
	
	if (timebaseInfo.denom == 0) {
		mach_timebase_info(&timebaseInfo);
	}
	
	deviceRecord = context;
	hidDeviceRecord = deviceRecord->privateData;
	element = IOHIDValueGetElement(value);
	cookie = IOHIDElementGetCookie(element);
	
	for (axisIndex = 0; axisIndex < deviceRecord->numAxes; axisIndex++) {
		if (!hidDeviceRecord->axisElements[axisIndex].isHatSwitchSecondAxis &&
		    hidDeviceRecord->axisElements[axisIndex].cookie == cookie) {
			CFIndex integerValue;
			
			if (IOHIDValueGetLength(value) > 4) {
				// Workaround for a strange crash that occurs with PS3 controller; was getting lengths of 39 (!)
				continue;
			}
			integerValue = IOHIDValueGetIntegerValue(value);
			
			if (hidDeviceRecord->axisElements[axisIndex].isHatSwitch) {
				int x, y;
				
				// Fix for Saitek X52
				if (!hidDeviceRecord->axisElements[axisIndex].hasNullState) {
					if (integerValue < hidDeviceRecord->axisElements[axisIndex].logicalMin) {
						integerValue = hidDeviceRecord->axisElements[axisIndex].logicalMax - hidDeviceRecord->axisElements[axisIndex].logicalMin + 1;
					} else {
						integerValue--;
					}
				}
				
				hatValueToXY(integerValue, hidDeviceRecord->axisElements[axisIndex].logicalMax - hidDeviceRecord->axisElements[axisIndex].logicalMin + 1, &x, &y);
				
				if (x != deviceRecord->axisStates[axisIndex]) {
					queueAxisEvent(deviceRecord,
					               IOHIDValueGetTimeStamp(value) * timebaseInfo.numer / timebaseInfo.denom * 0.000000001,
					               axisIndex,
					               x,
					               deviceRecord->axisStates[axisIndex]);
					
					deviceRecord->axisStates[axisIndex] = x;
				}
				
				if (y != deviceRecord->axisStates[axisIndex + 1]) {
					queueAxisEvent(deviceRecord,
					               IOHIDValueGetTimeStamp(value) * timebaseInfo.numer / timebaseInfo.denom * 0.000000001,
					               axisIndex + 1,
					               y,
					               deviceRecord->axisStates[axisIndex + 1]);
					
					deviceRecord->axisStates[axisIndex + 1] = y;
				}
				
			} else {
				float floatValue;
				
				if (integerValue < hidDeviceRecord->axisElements[axisIndex].logicalMin) {
					hidDeviceRecord->axisElements[axisIndex].logicalMin = integerValue;
				}
				if (integerValue > hidDeviceRecord->axisElements[axisIndex].logicalMax) {
					hidDeviceRecord->axisElements[axisIndex].logicalMax = integerValue;
				}
				floatValue = (integerValue - hidDeviceRecord->axisElements[axisIndex].logicalMin) / (float) (hidDeviceRecord->axisElements[axisIndex].logicalMax - hidDeviceRecord->axisElements[axisIndex].logicalMin) * 2.0f - 1.0f;
				
				queueAxisEvent(deviceRecord,
				               IOHIDValueGetTimeStamp(value) * timebaseInfo.numer / timebaseInfo.denom * 0.000000001,
				               axisIndex,
				               floatValue,
				               deviceRecord->axisStates[axisIndex]);
				
				deviceRecord->axisStates[axisIndex] = floatValue;
			}
			
			return;
		}
	}
	
	for (buttonIndex = 0; buttonIndex < deviceRecord->numButtons; buttonIndex++) {
		if (hidDeviceRecord->buttonElements[buttonIndex].cookie == cookie) {
			bool down;
			
			down = IOHIDValueGetIntegerValue(value);
			queueButtonEvent(deviceRecord,
			                 IOHIDValueGetTimeStamp(value) * timebaseInfo.numer / timebaseInfo.denom * 0.000000001,
			                 buttonIndex,
			                 down);
			
			deviceRecord->buttonStates[buttonIndex] = down;
			
			return;
		}
	}
}

static int IOHIDDeviceGetIntProperty(IOHIDDeviceRef deviceRef, CFStringRef key) {
	CFTypeRef typeRef;
	int value;
	
	typeRef = IOHIDDeviceGetProperty(deviceRef, key);
	if (typeRef == NULL || CFGetTypeID(typeRef) != CFNumberGetTypeID()) {
		return 0;
	}
	
	CFNumberGetValue((CFNumberRef) typeRef, kCFNumberSInt32Type, &value);
	return value;
}

static int IOHIDDeviceGetVendorID(IOHIDDeviceRef deviceRef) {
	return IOHIDDeviceGetIntProperty(deviceRef, CFSTR(kIOHIDVendorIDKey));
}

static int IOHIDDeviceGetProductID(IOHIDDeviceRef deviceRef) {
	return IOHIDDeviceGetIntProperty(deviceRef, CFSTR(kIOHIDProductIDKey));
}

static void onDeviceMatched(void * context, IOReturn result, void * sender, IOHIDDeviceRef device) {
	CFArrayRef elements;
	CFIndex elementIndex;
	IOHIDElementRef element;
	CFStringRef cfProductName;
	struct Gamepad_device * deviceRecord;
	struct Gamepad_devicePrivate * hidDeviceRecord;
	IOHIDElementType type;
	char * description;
	struct Gamepad_queuedEvent queuedEvent;
	
	deviceRecord = malloc(sizeof(struct Gamepad_device));
	deviceRecord->deviceID = nextDeviceID++;
	deviceRecord->vendorID = IOHIDDeviceGetVendorID(device);
	deviceRecord->productID = IOHIDDeviceGetProductID(device);
	deviceRecord->numAxes = 0;
	deviceRecord->numButtons = 0;
	devices = realloc(devices, sizeof(struct Gamepad_device *) * (numDevices + 1));
	devices[numDevices++] = deviceRecord;
	
	hidDeviceRecord = malloc(sizeof(struct Gamepad_devicePrivate));
	hidDeviceRecord->deviceRef = device;
	hidDeviceRecord->axisElements = NULL;
	hidDeviceRecord->buttonElements = NULL;
	deviceRecord->privateData = hidDeviceRecord;
	
	cfProductName = IOHIDDeviceGetProperty(device, CFSTR(kIOHIDProductKey));
	if (cfProductName == NULL || CFGetTypeID(cfProductName) != CFStringGetTypeID()) {
		description = malloc(strlen("[Unknown]" + 1));
		strcpy(description, "[Unknown]");
		
	} else {
		CFIndex length;
		
		CFStringGetBytes(cfProductName, CFRangeMake(0, CFStringGetLength(cfProductName)), kCFStringEncodingUTF8, '?', false, NULL, 100, &length);
		description = malloc(length + 1);
		CFStringGetBytes(cfProductName, CFRangeMake(0, CFStringGetLength(cfProductName)), kCFStringEncodingUTF8, '?', false, (UInt8 *) description, length + 1, NULL);
		description[length] = '\x00';
	}
	deviceRecord->description = description;
	
	elements = IOHIDDeviceCopyMatchingElements(device, NULL, kIOHIDOptionsTypeNone);
	for (elementIndex = 0; elementIndex < CFArrayGetCount(elements); elementIndex++) {
		element = (IOHIDElementRef) CFArrayGetValueAtIndex(elements, elementIndex);
		type = IOHIDElementGetType(element);
		
		// All of the axis elements I've ever detected have been kIOHIDElementTypeInput_Misc. kIOHIDElementTypeInput_Axis is only included for good faith...
		if (type == kIOHIDElementTypeInput_Misc ||
		    type == kIOHIDElementTypeInput_Axis) {
			
			hidDeviceRecord->axisElements = realloc(hidDeviceRecord->axisElements, sizeof(struct HIDGamepadAxis) * (deviceRecord->numAxes + 1));
			hidDeviceRecord->axisElements[deviceRecord->numAxes].cookie = IOHIDElementGetCookie(element);
			hidDeviceRecord->axisElements[deviceRecord->numAxes].logicalMin = IOHIDElementGetLogicalMin(element);
			hidDeviceRecord->axisElements[deviceRecord->numAxes].logicalMax = IOHIDElementGetLogicalMax(element);
			hidDeviceRecord->axisElements[deviceRecord->numAxes].hasNullState = !!IOHIDElementHasNullState(element);
			hidDeviceRecord->axisElements[deviceRecord->numAxes].isHatSwitch = IOHIDElementGetUsage(element) == kHIDUsage_GD_Hatswitch;
			hidDeviceRecord->axisElements[deviceRecord->numAxes].isHatSwitchSecondAxis = false;
			deviceRecord->numAxes++;
			
			if (hidDeviceRecord->axisElements[deviceRecord->numAxes - 1].isHatSwitch) {
				hidDeviceRecord->axisElements = realloc(hidDeviceRecord->axisElements, sizeof(struct HIDGamepadAxis) * (deviceRecord->numAxes + 1));
				hidDeviceRecord->axisElements[deviceRecord->numAxes].isHatSwitchSecondAxis = true;
				deviceRecord->numAxes++;
			}
			
		} else if (type == kIOHIDElementTypeInput_Button) {
			hidDeviceRecord->buttonElements = realloc(hidDeviceRecord->buttonElements, sizeof(struct HIDGamepadButton) * (deviceRecord->numButtons + 1));
			hidDeviceRecord->buttonElements[deviceRecord->numButtons].cookie = IOHIDElementGetCookie(element);
			deviceRecord->numButtons++;
		}
	}
	CFRelease(elements);
	
	deviceRecord->axisStates = calloc(sizeof(float), deviceRecord->numAxes);
	deviceRecord->buttonStates = calloc(sizeof(bool), deviceRecord->numButtons);
	
	IOHIDDeviceRegisterInputValueCallback(device, onDeviceValueChanged, deviceRecord);
	
	queuedEvent.deviceID = deviceRecord->deviceID;
	queuedEvent.eventType = GAMEPAD_EVENT_DEVICE_ATTACHED;
	queuedEvent.eventData = deviceRecord;
	
	if (deviceEventCount >= deviceEventQueueSize) {
		deviceEventQueueSize = deviceEventQueueSize == 0 ? 1 : deviceEventQueueSize * 2;
		deviceEventQueue = realloc(deviceEventQueue, sizeof(struct Gamepad_queuedEvent) * deviceEventQueueSize);
	}
	deviceEventQueue[deviceEventCount++] = queuedEvent;
}

static void disposeDevice(struct Gamepad_device * deviceRecord) {
	unsigned int inputEventIndex, deviceEventIndex;
	
	IOHIDDeviceRegisterInputValueCallback(((struct Gamepad_devicePrivate *) deviceRecord->privateData)->deviceRef, NULL, NULL);
	
	for (inputEventIndex = 0; inputEventIndex < inputEventCount; inputEventIndex++) {
		if (inputEventQueue[inputEventIndex].deviceID == deviceRecord->deviceID) {
			unsigned int inputEventIndex2;
			
			free(inputEventQueue[inputEventIndex].eventData);
			inputEventCount--;
			for (inputEventIndex2 = inputEventIndex; inputEventIndex2 < inputEventCount; inputEventIndex2++) {
				inputEventQueue[inputEventIndex2] = inputEventQueue[inputEventIndex2 + 1];
			}
			inputEventIndex--;
		}
	}
	
	for (deviceEventIndex = 0; deviceEventIndex < deviceEventCount; deviceEventIndex++) {
		if (deviceEventQueue[deviceEventIndex].deviceID == deviceRecord->deviceID) {
			unsigned int deviceEventIndex2;
			
			deviceEventCount--;
			for (deviceEventIndex2 = deviceEventIndex; deviceEventIndex2 < deviceEventCount; deviceEventIndex2++) {
				deviceEventQueue[deviceEventIndex2] = deviceEventQueue[deviceEventIndex2 + 1];
			}
			deviceEventIndex--;
		}
	}
	
	free(((struct Gamepad_devicePrivate *) deviceRecord->privateData)->axisElements);
	free(((struct Gamepad_devicePrivate *) deviceRecord->privateData)->buttonElements);
	free(deviceRecord->privateData);
	
	free((void *) deviceRecord->description);
	free(deviceRecord->axisStates);
	free(deviceRecord->buttonStates);
	
	free(deviceRecord);
}

static void onDeviceRemoved(void * context, IOReturn result, void * sender, IOHIDDeviceRef device) {
	unsigned int deviceIndex;
	
	for (deviceIndex = 0; deviceIndex < numDevices; deviceIndex++) {
		if (((struct Gamepad_devicePrivate *) devices[deviceIndex]->privateData)->deviceRef == device) {
			if (Gamepad_deviceRemoveCallback != NULL) {
				Gamepad_deviceRemoveCallback(devices[deviceIndex], Gamepad_deviceRemoveContext);
			}
			
			disposeDevice(devices[deviceIndex]);
			numDevices--;
			for (; deviceIndex < numDevices; deviceIndex++) {
				devices[deviceIndex] = devices[deviceIndex + 1];
			}
			return;
		}
	}
}

void Gamepad_init() {
	if (hidManager == NULL) {
		CFStringRef keys[2];
		int value;
		CFNumberRef values[2];
		CFDictionaryRef dictionaries[3];
		CFArrayRef array;
		
		hidManager = IOHIDManagerCreate(kCFAllocatorDefault, kIOHIDOptionsTypeNone);
		
		keys[0] = CFSTR(kIOHIDDeviceUsagePageKey);
		keys[1] = CFSTR(kIOHIDDeviceUsageKey);
		
		value = kHIDPage_GenericDesktop;
		values[0] = CFNumberCreate(kCFAllocatorDefault, kCFNumberSInt32Type, &value);
		value = kHIDUsage_GD_Joystick;
		values[1] = CFNumberCreate(kCFAllocatorDefault, kCFNumberSInt32Type, &value);
		dictionaries[0] = CFDictionaryCreate(kCFAllocatorDefault, (const void **) keys, (const void **) values, 2, &kCFTypeDictionaryKeyCallBacks, &kCFTypeDictionaryValueCallBacks);
		CFRelease(values[0]);
		CFRelease(values[1]);
		
		value = kHIDPage_GenericDesktop;
		values[0] = CFNumberCreate(kCFAllocatorDefault, kCFNumberSInt32Type, &value);
		value = kHIDUsage_GD_GamePad;
		values[1] = CFNumberCreate(kCFAllocatorDefault, kCFNumberSInt32Type, &value);
		dictionaries[1] = CFDictionaryCreate(kCFAllocatorDefault, (const void **) keys, (const void **) values, 2, &kCFTypeDictionaryKeyCallBacks, &kCFTypeDictionaryValueCallBacks);
		CFRelease(values[0]);
		CFRelease(values[1]);
		
		value = kHIDPage_GenericDesktop;
		values[0] = CFNumberCreate(kCFAllocatorDefault, kCFNumberSInt32Type, &value);
		value = kHIDUsage_GD_MultiAxisController;
		values[1] = CFNumberCreate(kCFAllocatorDefault, kCFNumberSInt32Type, &value);
		dictionaries[2] = CFDictionaryCreate(kCFAllocatorDefault, (const void **) keys, (const void **) values, 2, &kCFTypeDictionaryKeyCallBacks, &kCFTypeDictionaryValueCallBacks);
		CFRelease(values[0]);
		CFRelease(values[1]);
		
		array = CFArrayCreate(kCFAllocatorDefault, (const void **) dictionaries, 3, &kCFTypeArrayCallBacks);
		CFRelease(dictionaries[0]);
		CFRelease(dictionaries[1]);
		CFRelease(dictionaries[2]);
		IOHIDManagerSetDeviceMatchingMultiple(hidManager, array);
		CFRelease(array);
		
		IOHIDManagerRegisterDeviceMatchingCallback(hidManager, onDeviceMatched, NULL);
		IOHIDManagerRegisterDeviceRemovalCallback(hidManager, onDeviceRemoved, NULL);
		
		IOHIDManagerOpen(hidManager, kIOHIDOptionsTypeNone);
		
		// Force gamepads to be recognized immediately. The normal run loop mode takes a few frames,
		// but we can run one iteration with a custom mode to do it without a delay.
		IOHIDManagerScheduleWithRunLoop(hidManager, CFRunLoopGetCurrent(), GAMEPAD_RUN_LOOP_MODE);
		CFRunLoopRunInMode(GAMEPAD_RUN_LOOP_MODE, 0, true);
	}
}

void Gamepad_shutdown() {
	if (hidManager != NULL) {
		unsigned int deviceIndex;
		
		IOHIDManagerUnscheduleFromRunLoop(hidManager, CFRunLoopGetCurrent(), kCFRunLoopDefaultMode);
		
		for (deviceIndex = 0; deviceIndex < numDevices; deviceIndex++) {
			disposeDevice(devices[deviceIndex]);
		}
		free(devices);
		devices = NULL;
		numDevices = 0;
		
		IOHIDManagerClose(hidManager, 0);
		CFRelease(hidManager);
		hidManager = NULL;
	}
}

unsigned int Gamepad_numDevices() {
	return numDevices;
}

struct Gamepad_device * Gamepad_deviceAtIndex(unsigned int deviceIndex) {
	if (deviceIndex >= numDevices) {
		return NULL;
	}
	return devices[deviceIndex];
}

static void processQueuedEvent(struct Gamepad_queuedEvent event) {
	switch (event.eventType) {
		case GAMEPAD_EVENT_DEVICE_ATTACHED:
			if (Gamepad_deviceAttachCallback != NULL) {
				Gamepad_deviceAttachCallback(event.eventData, Gamepad_deviceAttachContext);
			}
			break;
			
		case GAMEPAD_EVENT_DEVICE_REMOVED:
			if (Gamepad_deviceRemoveCallback != NULL) {
				Gamepad_deviceRemoveCallback(event.eventData, Gamepad_deviceRemoveContext);
			}
			break;
			
		case GAMEPAD_EVENT_BUTTON_DOWN:
			if (Gamepad_buttonDownCallback != NULL) {
				struct Gamepad_buttonEvent * buttonEvent = event.eventData;
				Gamepad_buttonDownCallback(buttonEvent->device, buttonEvent->buttonID, buttonEvent->timestamp, Gamepad_buttonDownContext);
			}
			break;
			
		case GAMEPAD_EVENT_BUTTON_UP:
			if (Gamepad_buttonUpCallback != NULL) {
				struct Gamepad_buttonEvent * buttonEvent = event.eventData;
				Gamepad_buttonUpCallback(buttonEvent->device, buttonEvent->buttonID, buttonEvent->timestamp, Gamepad_buttonUpContext);
			}
			break;
			
		case GAMEPAD_EVENT_AXIS_MOVED:
			if (Gamepad_axisMoveCallback != NULL) {
				struct Gamepad_axisEvent * axisEvent = event.eventData;
				Gamepad_axisMoveCallback(axisEvent->device, axisEvent->axisID, axisEvent->value, axisEvent->lastValue, axisEvent->timestamp, Gamepad_axisMoveContext);
			}
			break;
	}
}

void Gamepad_detectDevices() {
	unsigned int eventIndex;
	
	if (hidManager == NULL) {
		return;
	}
	
	CFRunLoopRunInMode(GAMEPAD_RUN_LOOP_MODE, 0, true);
	for (eventIndex = 0; eventIndex < deviceEventCount; eventIndex++) {
		processQueuedEvent(deviceEventQueue[eventIndex]);
	}
	deviceEventCount = 0;
}

void Gamepad_processEvents() {
	unsigned int eventIndex;
	static bool inProcessEvents;
	
	if (hidManager == NULL || inProcessEvents) {
		return;
	}
	
	inProcessEvents = true;
	CFRunLoopRunInMode(GAMEPAD_RUN_LOOP_MODE, 0, true);
	for (eventIndex = 0; eventIndex < inputEventCount; eventIndex++) {
		processQueuedEvent(inputEventQueue[eventIndex]);
		free(inputEventQueue[eventIndex].eventData);
	}
	inputEventCount = 0;
	inProcessEvents = false;
}
