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
#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#include <regstr.h>

struct Gamepad_devicePrivate {
	UINT joystickID;
	JOYINFOEX lastState;
	int xAxisIndex;
	int yAxisIndex;
	int zAxisIndex;
	int rAxisIndex;
	int uAxisIndex;
	int vAxisIndex;
	int povXAxisIndex;
	int povYAxisIndex;
	UINT (* axisRanges)[2];
};

static struct Gamepad_device ** devices = NULL;
static unsigned int numDevices = 0;
static unsigned int nextDeviceID = 0;

static bool inited = false;

void Gamepad_init() {
	if (!inited) {
		inited = true;
		Gamepad_detectDevices();
	}
}

static void disposeDevice(struct Gamepad_device * deviceRecord) {
	free(((struct Gamepad_devicePrivate *) deviceRecord->privateData)->axisRanges);
	free(deviceRecord->privateData);
	
	free((void *) deviceRecord->description);
	free(deviceRecord->axisStates);
	free(deviceRecord->buttonStates);
	
	free(deviceRecord);
}

void Gamepad_shutdown() {
	unsigned int deviceIndex;
	
	if (inited) {
		for (deviceIndex = 0; deviceIndex < numDevices; deviceIndex++) {
			disposeDevice(devices[deviceIndex]);
		}
		free(devices);
		devices = NULL;
		numDevices = 0;
		inited = false;
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

#define REG_STRING_MAX 256

static char * getDeviceDescription(UINT joystickID, JOYCAPS caps) {
	char * description = NULL;
	char subkey[REG_STRING_MAX];
	HKEY topKey, key;
	LONG result;
	
	snprintf(subkey, REG_STRING_MAX, "%s\\%s\\%s", REGSTR_PATH_JOYCONFIG, caps.szRegKey, REGSTR_KEY_JOYCURR);
	result = RegOpenKeyEx(topKey = HKEY_LOCAL_MACHINE, subkey, 0, KEY_READ, &key);
	if (result != ERROR_SUCCESS) {
		result = RegOpenKeyEx(topKey = HKEY_CURRENT_USER, subkey, 0, KEY_READ, &key);
	}
	if (result == ERROR_SUCCESS) {
		char value[REG_STRING_MAX];
		char name[REG_STRING_MAX];
		DWORD nameSize;
		
		snprintf(value, REG_STRING_MAX, "Joystick%d%s", joystickID + 1, REGSTR_VAL_JOYOEMNAME);
		nameSize = sizeof(name);
		result = RegQueryValueEx(key, value, NULL, NULL, (LPBYTE) name, &nameSize);
		RegCloseKey(key);
		
		if (result == ERROR_SUCCESS) {
			snprintf(subkey, REG_STRING_MAX, "%s\\%s", REGSTR_PATH_JOYOEM, name);
			result = RegOpenKeyEx(topKey, subkey, 0, KEY_READ, &key);
			
			if (result == ERROR_SUCCESS) {
				nameSize = sizeof(name);
				result = RegQueryValueEx(key, REGSTR_VAL_JOYOEMNAME, NULL, NULL, NULL, &nameSize);
				
				if (result == ERROR_SUCCESS) {
					description = malloc(nameSize);
					result = RegQueryValueEx(key, REGSTR_VAL_JOYOEMNAME, NULL, NULL, (LPBYTE) description, &nameSize);
				}
				RegCloseKey(key);
				
				if (result == ERROR_SUCCESS) {
					return description;
				}
				free(description);
			}
		}
	}
	
	description = malloc(strlen(caps.szPname) + 1);
	strcpy(description, caps.szPname);
	
	return description;
}

void Gamepad_detectDevices() {
	unsigned int numPadsSupported;
	unsigned int deviceIndex, deviceIndex2;
	JOYINFOEX info;
	JOYCAPS caps;
	bool duplicate;
	struct Gamepad_device * deviceRecord;
	struct Gamepad_devicePrivate * deviceRecordPrivate;
	UINT joystickID;
	int axisIndex;
	
	if (!inited) {
		return;
	}
	
	numPadsSupported = joyGetNumDevs();
	for (deviceIndex = 0; deviceIndex < numPadsSupported; deviceIndex++) {
		info.dwSize = sizeof(info);
		info.dwFlags = JOY_RETURNALL;
		joystickID = JOYSTICKID1 + deviceIndex;
		if (joyGetPosEx(joystickID, &info) == JOYERR_NOERROR &&
		    joyGetDevCaps(joystickID, &caps, sizeof(JOYCAPS)) == JOYERR_NOERROR) {
			
			duplicate = false;
			for (deviceIndex2 = 0; deviceIndex2 < numDevices; deviceIndex2++) {
				if (((struct Gamepad_devicePrivate *) devices[deviceIndex2]->privateData)->joystickID == joystickID) {
					duplicate = true;
					break;
				}
			}
			if (duplicate) {
				continue;
			}
			
			deviceRecord = malloc(sizeof(struct Gamepad_device));
			deviceRecord->deviceID = nextDeviceID++;
			deviceRecord->description = getDeviceDescription(joystickID, caps);
			deviceRecord->vendorID = caps.wMid;
			deviceRecord->productID = caps.wPid;
			deviceRecord->numAxes = caps.wNumAxes + ((caps.wCaps & JOYCAPS_HASPOV) ? 2 : 0);
			deviceRecord->numButtons = caps.wNumButtons;
			deviceRecord->axisStates = calloc(sizeof(float), deviceRecord->numAxes);
			deviceRecord->buttonStates = calloc(sizeof(bool), deviceRecord->numButtons);
			devices = realloc(devices, sizeof(struct Gamepad_device *) * (numDevices + 1));
			devices[numDevices++] = deviceRecord;
			
			deviceRecordPrivate = malloc(sizeof(struct Gamepad_devicePrivate));
			deviceRecordPrivate->joystickID = joystickID;
			deviceRecordPrivate->lastState = info;
			
			deviceRecordPrivate->xAxisIndex = 0;
			deviceRecordPrivate->yAxisIndex = 1;
			axisIndex = 2;
			deviceRecordPrivate->zAxisIndex = (caps.wCaps & JOYCAPS_HASZ) ? axisIndex++ : -1;
			deviceRecordPrivate->rAxisIndex = (caps.wCaps & JOYCAPS_HASR) ? axisIndex++ : -1;
			deviceRecordPrivate->uAxisIndex = (caps.wCaps & JOYCAPS_HASU) ? axisIndex++ : -1;
			deviceRecordPrivate->vAxisIndex = (caps.wCaps & JOYCAPS_HASV) ? axisIndex++ : -1;
			
			deviceRecordPrivate->axisRanges = malloc(sizeof(UINT[2]) * axisIndex);
			deviceRecordPrivate->axisRanges[0][0] = caps.wXmin;
			deviceRecordPrivate->axisRanges[0][1] = caps.wXmax;
			deviceRecordPrivate->axisRanges[1][0] = caps.wYmin;
			deviceRecordPrivate->axisRanges[1][1] = caps.wYmax;
			if (deviceRecordPrivate->zAxisIndex != -1) {
				deviceRecordPrivate->axisRanges[deviceRecordPrivate->zAxisIndex][0] = caps.wZmin;
				deviceRecordPrivate->axisRanges[deviceRecordPrivate->zAxisIndex][1] = caps.wZmax;
			}
			if (deviceRecordPrivate->rAxisIndex != -1) {
				deviceRecordPrivate->axisRanges[deviceRecordPrivate->rAxisIndex][0] = caps.wRmin;
				deviceRecordPrivate->axisRanges[deviceRecordPrivate->rAxisIndex][1] = caps.wRmax;
			}
			if (deviceRecordPrivate->uAxisIndex != -1) {
				deviceRecordPrivate->axisRanges[deviceRecordPrivate->uAxisIndex][0] = caps.wUmin;
				deviceRecordPrivate->axisRanges[deviceRecordPrivate->uAxisIndex][1] = caps.wUmax;
			}
			if (deviceRecordPrivate->vAxisIndex != -1) {
				deviceRecordPrivate->axisRanges[deviceRecordPrivate->vAxisIndex][0] = caps.wVmin;
				deviceRecordPrivate->axisRanges[deviceRecordPrivate->vAxisIndex][1] = caps.wVmax;
			}
			
			deviceRecordPrivate->povXAxisIndex = (caps.wCaps & JOYCAPS_HASPOV) ? axisIndex++ : -1;
			deviceRecordPrivate->povYAxisIndex = (caps.wCaps & JOYCAPS_HASPOV) ? axisIndex++ : -1;
			
			deviceRecord->privateData = deviceRecordPrivate;
			
			if (Gamepad_deviceAttachCallback != NULL) {
				Gamepad_deviceAttachCallback(deviceRecord, Gamepad_deviceAttachContext);
			}
		}
	}
}

static double currentTime() {
	// HACK: No timestamp data from joyGetInfoEx, so we make it up
	static LARGE_INTEGER frequency;
	LARGE_INTEGER currentTime;
	
	if (frequency.QuadPart == 0) {
		QueryPerformanceFrequency(&frequency);
	}
	QueryPerformanceCounter(&currentTime);
	
	return (double) currentTime.QuadPart / frequency.QuadPart;
}

static void handleAxisChange(struct Gamepad_device * device, int axisIndex, DWORD ivalue) {
	float value, lastValue;
	struct Gamepad_devicePrivate * devicePrivate;
	
	if (axisIndex < 0 || axisIndex >= (int) device->numAxes) {
		return;
	}
	
	devicePrivate = device->privateData;
	value = (ivalue - devicePrivate->axisRanges[axisIndex][0]) / (float) (devicePrivate->axisRanges[axisIndex][1] - devicePrivate->axisRanges[axisIndex][0]) * 2.0f - 1.0f;
	
	lastValue = device->axisStates[axisIndex];
	device->axisStates[axisIndex] = value;
	if (Gamepad_axisMoveCallback != NULL) {
		Gamepad_axisMoveCallback(device, axisIndex, value, lastValue, currentTime(), Gamepad_axisMoveContext);
	}
}

static void handleButtonChange(struct Gamepad_device * device, DWORD lastValue, DWORD value) {
	bool down;
	unsigned int buttonIndex;
	
	for (buttonIndex = 0; buttonIndex < device->numButtons; buttonIndex++) {
		if ((lastValue ^ value) & (1 << buttonIndex)) {
			down = !!(value & (1 << buttonIndex));
			
			device->buttonStates[buttonIndex] = down;
			if (down && Gamepad_buttonDownCallback != NULL) {
				Gamepad_buttonDownCallback(device, buttonIndex, currentTime(), Gamepad_buttonDownContext);
			} else if (!down && Gamepad_buttonUpCallback != NULL) {
				Gamepad_buttonUpCallback(device, buttonIndex, currentTime(), Gamepad_buttonUpContext);
			}
		}
	}
}

static void povToXY(DWORD pov, int * outX, int * outY) {
	if (pov == JOY_POVCENTERED) {
		*outX = *outY = 0;
		
	} else {
		if (pov > JOY_POVFORWARD && pov < JOY_POVBACKWARD) {
			*outX = 1;
			
		} else if (pov > JOY_POVBACKWARD) {
			*outX = -1;
			
		} else {
			*outX = 0;
		}
		
		if (pov > JOY_POVLEFT || pov < JOY_POVRIGHT) {
			*outY = -1;
			
		} else if (pov > JOY_POVRIGHT && pov < JOY_POVLEFT) {
			*outY = 1;
			
		} else {
			*outY = 0;
		}
	}
}

static void handlePOVChange(struct Gamepad_device * device, DWORD lastValue, DWORD value) {
	struct Gamepad_devicePrivate * devicePrivate;
	int lastX, lastY, newX, newY;
	
	devicePrivate = device->privateData;
	
	if (devicePrivate->povXAxisIndex == -1 || devicePrivate->povYAxisIndex == -1) {
		return;
	}
	
	povToXY(lastValue, &lastX, &lastY);
	povToXY(value, &newX, &newY);
	
	if (newX != lastX) {
		device->axisStates[devicePrivate->povXAxisIndex] = newX;
		if (Gamepad_axisMoveCallback != NULL) {
			Gamepad_axisMoveCallback(device, devicePrivate->povXAxisIndex, newX, lastX, currentTime(), Gamepad_axisMoveContext);
		}
	}
	if (newY != lastY) {
		device->axisStates[devicePrivate->povYAxisIndex] = newY;
		if (Gamepad_axisMoveCallback != NULL) {
			Gamepad_axisMoveCallback(device, devicePrivate->povYAxisIndex, newY, lastY, currentTime(), Gamepad_axisMoveContext);
		}
	}
}

void Gamepad_processEvents() {
	unsigned int deviceIndex;
	static bool inProcessEvents;
	JOYINFOEX info;
	MMRESULT result;
	struct Gamepad_device * device;
	struct Gamepad_devicePrivate * devicePrivate;
	
	if (!inited || inProcessEvents) {
		return;
	}
	
	inProcessEvents = true;
	for (deviceIndex = 0; deviceIndex < numDevices; deviceIndex++) {
		device = devices[deviceIndex];
		devicePrivate = device->privateData;
		
		info.dwSize = sizeof(info);
		info.dwFlags = JOY_RETURNALL;
		result = joyGetPosEx(devicePrivate->joystickID, &info);
		if (result == JOYERR_UNPLUGGED) {
			if (Gamepad_deviceRemoveCallback != NULL) {
				Gamepad_deviceRemoveCallback(device, Gamepad_deviceRemoveContext);
			}
			
			disposeDevice(device);
			numDevices--;
			for (; deviceIndex < numDevices; deviceIndex++) {
				devices[deviceIndex] = devices[deviceIndex + 1];
			}
			
		} else if (result == JOYERR_NOERROR) {
			if (info.dwXpos != devicePrivate->lastState.dwXpos) {
				handleAxisChange(device, devicePrivate->xAxisIndex, info.dwXpos);
			}
			if (info.dwYpos != devicePrivate->lastState.dwYpos) {
				handleAxisChange(device, devicePrivate->yAxisIndex, info.dwYpos);
			}
			if (info.dwZpos != devicePrivate->lastState.dwZpos) {
				handleAxisChange(device, devicePrivate->zAxisIndex, info.dwZpos);
			}
			if (info.dwRpos != devicePrivate->lastState.dwRpos) {
				handleAxisChange(device, devicePrivate->rAxisIndex, info.dwRpos);
			}
			if (info.dwUpos != devicePrivate->lastState.dwUpos) {
				handleAxisChange(device, devicePrivate->uAxisIndex, info.dwUpos);
			}
			if (info.dwVpos != devicePrivate->lastState.dwVpos) {
				handleAxisChange(device, devicePrivate->vAxisIndex, info.dwVpos);
			}
			if (info.dwPOV != devicePrivate->lastState.dwPOV) {
				handlePOVChange(device, devicePrivate->lastState.dwPOV, info.dwPOV);
			}
			if (info.dwButtons != devicePrivate->lastState.dwButtons) {
				handleButtonChange(device, devicePrivate->lastState.dwButtons, info.dwButtons);
			}
			devicePrivate->lastState = info;
		}
	}
	inProcessEvents = false;
}

