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

// Special thanks to SDL2 for portions of DirectInput and XInput code used in this implementation

#define _WIN32_WINNT 0x0501
#define INITGUID
#define DIRECTINPUT_VERSION 0x0800
#ifdef _MSC_VER
#define strdup _strdup
#undef UNICODE
#else
#define __in
#define __out
#define __reserved
#endif
  
#include "gamepad/Gamepad.h"
#include "gamepad/Gamepad_private.h"
#include <stdio.h>
#include <stdlib.h>

#include <windows.h>
#include <regstr.h>
#include <dinput.h>
#include <XInput.h>

// Copy from MinGW-w64 to MinGW, along with wbemcli.h, wbemprov.h, wbemdisp.h, and wbemtran.h
#ifndef __MINGW_EXTENSION
#define __MINGW_EXTENSION
#endif
#define COBJMACROS 1
#include <wbemidl.h>
#include <oleauto.h>
// Super helpful info: http://www.wreckedgames.com/forum/index.php?topic=2584.0

#define INPUT_QUEUE_SIZE 32
#define XINPUT_GAMEPAD_GUIDE 0x400

typedef struct {
	WORD wButtons;
	BYTE bLeftTrigger;
	BYTE bRightTrigger;
	SHORT sThumbLX;
	SHORT sThumbLY;
	SHORT sThumbRX;
	SHORT sThumbRY;
	DWORD dwPaddingReserved;
} XINPUT_GAMEPAD_EX;

typedef struct {
	DWORD dwPacketNumber;
	XINPUT_GAMEPAD_EX Gamepad;
} XINPUT_STATE_EX;

struct diAxisInfo {
	DWORD offset;
	bool isPOV;
	bool isPOVSecondAxis;
};

struct Gamepad_devicePrivate {
	bool isXInput;
	
	// DInput only
	GUID guidInstance;
	IDirectInputDevice8 * deviceInterface;
	bool buffered;
	unsigned int sliderCount;
	unsigned int povCount;
	struct diAxisInfo * axisInfo;
	DWORD * buttonOffsets;
	
	// XInput only
	unsigned int playerIndex;
};

static struct Gamepad_device ** devices = NULL;
static unsigned int numDevices = 0;
static unsigned int nextDeviceID = 0;
static struct Gamepad_device * registeredXInputDevices[4];
static const char * xInputDeviceNames[4] = {
	"XInput Controller 1",
	"XInput Controller 2",
	"XInput Controller 3",
	"XInput Controller 4"
};
static DWORD (WINAPI * XInputGetStateEx_proc)(DWORD dwUserIndex, XINPUT_STATE_EX * pState);
static DWORD (WINAPI * XInputGetState_proc)(DWORD dwUserIndex, XINPUT_STATE * pState);
static DWORD (WINAPI * XInputGetCapabilities_proc)(DWORD dwUserIndex, DWORD dwFlags, XINPUT_CAPABILITIES * pCapabilities);

static LPDIRECTINPUT directInputInterface;
static bool inited = false;
static bool xInputAvailable;

void Gamepad_init() {
	if (!inited) {
		HRESULT result;
		HMODULE module;
		HRESULT (WINAPI * DirectInput8Create_proc)(HINSTANCE, DWORD, REFIID, LPVOID *, LPUNKNOWN);
		
		module = LoadLibrary("XInput1_4.dll");
		if (module == NULL) {
			module = LoadLibrary("XInput1_3.dll");
		}
		if (module == NULL) {
			module = LoadLibrary("bin\\XInput1_3.dll");
		}
		if (module == NULL) {
			fprintf(stderr, "Gamepad_init couldn't load XInput1_4.dll or XInput1_3.dll; proceeding with DInput only\n");
			xInputAvailable = false;
		} else {
			xInputAvailable = true;
			XInputGetStateEx_proc = (DWORD (WINAPI *)(DWORD, XINPUT_STATE_EX *)) GetProcAddress(module, (LPCSTR) 100);
			XInputGetState_proc = (DWORD (WINAPI *)(DWORD, XINPUT_STATE *)) GetProcAddress(module, "XInputGetState");
			XInputGetCapabilities_proc = (DWORD (WINAPI *)(DWORD, DWORD, XINPUT_CAPABILITIES *)) GetProcAddress(module, "XInputGetCapabilities");
		}

		//result = DirectInput8Create(GetModuleHandle(NULL), DIRECTINPUT_VERSION, &IID_IDirectInput8, (void **) &directInputInterface, NULL);
		// Calling DirectInput8Create directly crashes in 64-bit builds for some reason. Loading it with GetProcAddress works though!
		
		module = LoadLibrary("DINPUT8.dll");
		if (module == NULL) {
			fprintf(stderr, "Gamepad_init fatal error: Couldn't load DINPUT8.dll\n");
			abort();
		}
		DirectInput8Create_proc = (HRESULT (WINAPI *)(HINSTANCE, DWORD, REFIID, LPVOID *, LPUNKNOWN)) GetProcAddress(module, "DirectInput8Create");
		result = DirectInput8Create_proc(GetModuleHandle(NULL), DIRECTINPUT_VERSION, &IID_IDirectInput8, (void **) &directInputInterface, NULL);
		
		if (result != DI_OK) {
			fprintf(stderr, "Warning: DirectInput8Create returned 0x%X\n", (unsigned int) result);
		}
		
		inited = true;
		Gamepad_detectDevices();
	}
}

static void disposeDevice(struct Gamepad_device * deviceRecord) {
	struct Gamepad_devicePrivate * deviceRecordPrivate = deviceRecord->privateData;
	
	if (!deviceRecordPrivate->isXInput) {
		IDirectInputDevice8_Release(deviceRecordPrivate->deviceInterface);
		free(deviceRecordPrivate->axisInfo);
		free(deviceRecordPrivate->buttonOffsets);
		free((void *) deviceRecord->description);
	}
	free(deviceRecordPrivate);
	
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
		for (deviceIndex = 0; deviceIndex < 4; deviceIndex++) {
			registeredXInputDevices[deviceIndex] = NULL;
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

static double currentTime() {
	static LARGE_INTEGER frequency;
	LARGE_INTEGER currentTime;
	
	if (frequency.QuadPart == 0) {
		QueryPerformanceFrequency(&frequency);
	}
	QueryPerformanceCounter(&currentTime);
	
	return (double) currentTime.QuadPart / frequency.QuadPart;
}

#if 0
// This code from http://msdn.microsoft.com/en-us/library/windows/desktop/ee417014(v=vs.85).aspx is really really really slow
static bool isXInputDevice(const GUID * pGuidProductFromDirectInput) {
	IWbemLocator * pIWbemLocator = NULL;
	IEnumWbemClassObject * pEnumDevices = NULL;
	IWbemClassObject * pDevices[20] = {0};
	IWbemServices * pIWbemServices = NULL;
	BSTR bstrNamespace = NULL;
	BSTR bstrDeviceID = NULL;
	BSTR bstrClassName = NULL;
	DWORD uReturned = 0;
	bool bIsXinputDevice = false;
	UINT iDevice = 0;
	VARIANT var;
	HRESULT hr;
	
	hr = CoInitialize(NULL);
	bool bCleanupCOM = SUCCEEDED(hr);
	
	hr = CoCreateInstance(&CLSID_WbemLocator,
	                      NULL,
	                      CLSCTX_INPROC_SERVER,
	                      &IID_IWbemLocator,
	                      (LPVOID *) &pIWbemLocator);
	if (FAILED(hr) || pIWbemLocator == NULL) {
		goto LCleanup;
	}
	
	bstrNamespace = SysAllocString(L"\\\\.\\root\\cimv2"); if (bstrNamespace == NULL) {goto LCleanup;}
	bstrClassName = SysAllocString(L"Win32_PNPEntity");    if (bstrClassName == NULL) {goto LCleanup;}
	bstrDeviceID  = SysAllocString(L"DeviceID");           if (bstrDeviceID == NULL)  {goto LCleanup;}
	
	hr = IWbemLocator_ConnectServer(pIWbemLocator, bstrNamespace, NULL, NULL, 0L,
	                                0L, NULL, NULL, &pIWbemServices);
	if (FAILED(hr) || pIWbemServices == NULL) {
		goto LCleanup;
	}
	
	CoSetProxyBlanket((IUnknown *) pIWbemServices, RPC_C_AUTHN_WINNT, RPC_C_AUTHZ_NONE, NULL,
	                  RPC_C_AUTHN_LEVEL_CALL, RPC_C_IMP_LEVEL_IMPERSONATE, NULL, EOAC_NONE);
	
	hr = IWbemServices_CreateInstanceEnum(pIWbemServices, bstrClassName, 0, NULL, &pEnumDevices);
	if (FAILED(hr) || pEnumDevices == NULL) {
		goto LCleanup;
	}
	
	for (;;) {
		hr = IEnumWbemClassObject_Next(pEnumDevices, 10000, 20, pDevices, &uReturned);
		if (FAILED(hr)) {
			goto LCleanup;
		}
		if (uReturned == 0) {
			break;
		}
		for (iDevice = 0; iDevice < uReturned; iDevice++) {
			hr = IWbemClassObject_Get(pDevices[iDevice], bstrDeviceID, 0L, &var, NULL, NULL);
			if (SUCCEEDED(hr) && var.vt == VT_BSTR && var.bstrVal != NULL) {
				if (wcsstr(var.bstrVal, L"IG_")) {
					DWORD dwPid = 0, dwVid = 0;
					WCHAR * strVid = wcsstr(var.bstrVal, L"VID_");
					if (strVid && swscanf(strVid, L"VID_%4X", &dwVid) != 1) {
						dwVid = 0;
					}
					WCHAR * strPid = wcsstr(var.bstrVal, L"PID_");
					if (strPid != NULL && swscanf(strPid, L"PID_%4X", &dwPid) != 1) {
						dwPid = 0;
					}
					DWORD dwVidPid = MAKELONG(dwVid, dwPid);
					if (dwVidPid == pGuidProductFromDirectInput->Data1) {
						bIsXinputDevice = true;
						goto LCleanup;
					}
				}
			}
			if (pDevices[iDevice] != NULL) {
				IWbemClassObject_Release(pDevices[iDevice]);
				pDevices[iDevice] = NULL;
			}
		}
	}
	
LCleanup:
	if (bstrNamespace != NULL) {
		SysFreeString(bstrNamespace);
	}
	if (bstrDeviceID != NULL) {
		SysFreeString(bstrDeviceID);
	}
	if (bstrClassName != NULL) {
		SysFreeString(bstrClassName);
	}
	for (iDevice = 0; iDevice < uReturned; iDevice++) {
		if (pDevices[iDevice] != NULL) {
			IWbemClassObject_Release(pDevices[iDevice]);
		}
	}
	if (pEnumDevices != NULL) {
		IEnumWbemClassObject_Release(pEnumDevices);
	}
	if (pIWbemLocator != NULL) {
		IWbemLocator_Release(pIWbemLocator);
	}
	if (pIWbemServices != NULL) {
		IWbemServices_Release(pIWbemServices);
	}
	
	if (bCleanupCOM) {
		CoUninitialize();
	}
	
	return bIsXinputDevice;
}
#else
// This code from SDL2 is much faster

DEFINE_GUID(IID_ValveStreamingGamepad, MAKELONG(0x28DE, 0x11FF),0x0000,0x0000,0x00,0x00,0x50,0x49,0x44,0x56,0x49,0x44);
DEFINE_GUID(IID_X360WiredGamepad, MAKELONG(0x045E, 0x02A1),0x0000,0x0000,0x00,0x00,0x50,0x49,0x44,0x56,0x49,0x44);
DEFINE_GUID(IID_X360WirelessGamepad, MAKELONG(0x045E, 0x028E),0x0000,0x0000,0x00,0x00,0x50,0x49,0x44,0x56,0x49,0x44);

static PRAWINPUTDEVICELIST rawDevList = NULL;
static UINT rawDevListCount = 0;

static bool isXInputDevice(const GUID * pGuidProductFromDirectInput) {
	static const GUID * s_XInputProductGUID[] = {
		&IID_ValveStreamingGamepad,
		&IID_X360WiredGamepad,   // Microsoft's wired X360 controller for Windows
		&IID_X360WirelessGamepad // Microsoft's wireless X360 controller for Windows
	};
	
	size_t iDevice;
	UINT i;
	
	// Check for well known XInput device GUIDs
	// This lets us skip RAWINPUT for popular devices. Also, we need to do this for the Valve Streaming Gamepad because it's virtualized and doesn't show up in the device list.
	for (iDevice = 0; iDevice < sizeof(s_XInputProductGUID) / sizeof(s_XInputProductGUID[0]); ++iDevice) {
		if (!memcmp(pGuidProductFromDirectInput, s_XInputProductGUID[iDevice], sizeof(GUID))) {
			return true;
		}
	}
	
	// Go through RAWINPUT (WinXP and later) to find HID devices.
	// Cache this if we end up using it.
	if (rawDevList == NULL) {
		if ((GetRawInputDeviceList(NULL, &rawDevListCount, sizeof(RAWINPUTDEVICELIST)) == (UINT) -1) || rawDevListCount == 0) {
			return false;
		}
		
		rawDevList = malloc(sizeof(RAWINPUTDEVICELIST) * rawDevListCount);
		
		if (GetRawInputDeviceList(rawDevList, &rawDevListCount, sizeof(RAWINPUTDEVICELIST)) == (UINT) -1) {
			free(rawDevList);
			rawDevList = NULL;
			return false;
		}
	}
	
	for (i = 0; i < rawDevListCount; i++) {
		RID_DEVICE_INFO rdi;
		char devName[128];
		UINT rdiSize = sizeof(rdi);
		UINT nameSize = sizeof(devName);
		
		rdi.cbSize = sizeof(rdi);
		if (rawDevList[i].dwType == RIM_TYPEHID &&
		    GetRawInputDeviceInfoA(rawDevList[i].hDevice, RIDI_DEVICEINFO, &rdi, &rdiSize) != (UINT) -1 &&
		    MAKELONG(rdi.hid.dwVendorId, rdi.hid.dwProductId) == (LONG) pGuidProductFromDirectInput->Data1 &&
		    GetRawInputDeviceInfoA(rawDevList[i].hDevice, RIDI_DEVICENAME, devName, &nameSize) != (UINT) -1 &&
		    strstr(devName, "IG_") != NULL) {
			return true;
		}
	}
	
	return false;
}
#endif

static BOOL CALLBACK countAxesCallback(LPCDIDEVICEOBJECTINSTANCE instance, LPVOID context) {
	struct Gamepad_device * deviceRecord = context;
	
	deviceRecord->numAxes++;
	if (instance->dwType & DIDFT_POV) {
		deviceRecord->numAxes++;
	}
	return DIENUM_CONTINUE;
}

static BOOL CALLBACK countButtonsCallback(LPCDIDEVICEOBJECTINSTANCE instance, LPVOID context) {
	struct Gamepad_device * deviceRecord = context;
	
	deviceRecord->numButtons++;
	return DIENUM_CONTINUE;
}

#define AXIS_MIN -32768
#define AXIS_MAX 32767

static BOOL CALLBACK enumAxesCallback(LPCDIDEVICEOBJECTINSTANCE instance, LPVOID context) {
	struct Gamepad_device * deviceRecord = context;
	struct Gamepad_devicePrivate * deviceRecordPrivate = deviceRecord->privateData;
	DWORD offset;
	
	deviceRecord->numAxes++;
	if (instance->dwType & DIDFT_POV) {
		offset = DIJOFS_POV(deviceRecordPrivate->povCount);
		deviceRecordPrivate->axisInfo[deviceRecord->numAxes - 1].offset = offset;
		deviceRecordPrivate->axisInfo[deviceRecord->numAxes - 1].isPOV = true;
		deviceRecord->numAxes++;
		deviceRecordPrivate->axisInfo[deviceRecord->numAxes - 1].offset = offset;
		deviceRecordPrivate->axisInfo[deviceRecord->numAxes - 1].isPOV = true;
		deviceRecordPrivate->povCount++;
		
	} else {
		DIPROPRANGE range;
		DIPROPDWORD deadZone;
		HRESULT result;
		
		if (!memcmp(&instance->guidType, &GUID_XAxis, sizeof(instance->guidType))) {
			offset = DIJOFS_X;
		} else if (!memcmp(&instance->guidType, &GUID_YAxis, sizeof(instance->guidType))) {
			offset = DIJOFS_Y;
		} else if (!memcmp(&instance->guidType, &GUID_ZAxis, sizeof(instance->guidType))) {
			offset = DIJOFS_Z;
		} else if (!memcmp(&instance->guidType, &GUID_RxAxis, sizeof(instance->guidType))) {
			offset = DIJOFS_RX;
		} else if (!memcmp(&instance->guidType, &GUID_RyAxis, sizeof(instance->guidType))) {
			offset = DIJOFS_RY;
		} else if (!memcmp(&instance->guidType, &GUID_RzAxis, sizeof(instance->guidType))) {
			offset = DIJOFS_RZ;
		} else if (!memcmp(&instance->guidType, &GUID_Slider, sizeof(instance->guidType))) {
			offset = DIJOFS_SLIDER(deviceRecordPrivate->sliderCount++);
		} else {
			offset = -1;
		}
		deviceRecordPrivate->axisInfo[deviceRecord->numAxes - 1].offset = offset;
		deviceRecordPrivate->axisInfo[deviceRecord->numAxes - 1].isPOV = false;
		
		range.diph.dwSize = sizeof(range);
		range.diph.dwHeaderSize = sizeof(range.diph);
		range.diph.dwObj = instance->dwType;
		range.diph.dwHow = DIPH_BYID;
		range.lMin = AXIS_MIN;
		range.lMax = AXIS_MAX;
		
		result = IDirectInputDevice8_SetProperty(deviceRecordPrivate->deviceInterface, DIPROP_RANGE, &range.diph);
		if (result != DI_OK) {
			fprintf(stderr, "Warning: IDIrectInputDevice8_SetProperty returned 0x%X\n", (unsigned int) result);
		}
		
		deadZone.diph.dwSize = sizeof(deadZone);
		deadZone.diph.dwHeaderSize = sizeof(deadZone.diph);
		deadZone.diph.dwObj = instance->dwType;
		deadZone.diph.dwHow = DIPH_BYID;
		deadZone.dwData = 0;
		result = IDirectInputDevice8_SetProperty(deviceRecordPrivate->deviceInterface, DIPROP_DEADZONE, &deadZone.diph);
		if (result != DI_OK) {
			fprintf(stderr, "Warning: IDIrectInputDevice8_SetProperty returned 0x%X\n", (unsigned int) result);
		}
	}
	return DIENUM_CONTINUE;
}

static BOOL CALLBACK enumButtonsCallback(LPCDIDEVICEOBJECTINSTANCE instance, LPVOID context) {
	struct Gamepad_device * deviceRecord = context;
	struct Gamepad_devicePrivate * deviceRecordPrivate = deviceRecord->privateData;
	
	deviceRecordPrivate->buttonOffsets[deviceRecord->numButtons] = DIJOFS_BUTTON(deviceRecord->numButtons);
	deviceRecord->numButtons++;
	return DIENUM_CONTINUE;
}

#ifdef _MSC_VER
#ifndef DIDFT_OPTIONAL
#define DIDFT_OPTIONAL      0x80000000
#endif

/* Taken from Wine - Thanks! */
DIOBJECTDATAFORMAT dfDIJoystick2[] = {
	{ &GUID_XAxis, DIJOFS_X, DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_YAxis, DIJOFS_Y, DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_ZAxis, DIJOFS_Z, DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_RxAxis, DIJOFS_RX, DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_RyAxis, DIJOFS_RY, DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_RzAxis, DIJOFS_RZ, DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_Slider, DIJOFS_SLIDER(0), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_Slider, DIJOFS_SLIDER(1), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_POV, DIJOFS_POV(0), DIDFT_OPTIONAL | DIDFT_POV | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_POV, DIJOFS_POV(1), DIDFT_OPTIONAL | DIDFT_POV | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_POV, DIJOFS_POV(2), DIDFT_OPTIONAL | DIDFT_POV | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_POV, DIJOFS_POV(3), DIDFT_OPTIONAL | DIDFT_POV | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(0), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(1), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(2), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(3), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(4), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(5), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(6), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(7), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(8), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(9), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(10), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(11), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(12), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(13), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(14), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(15), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(16), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(17), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(18), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(19), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(20), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(21), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(22), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(23), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(24), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(25), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(26), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(27), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(28), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(29), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(30), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(31), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(32), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(33), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(34), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(35), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(36), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(37), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(38), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(39), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(40), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(41), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(42), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(43), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(44), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(45), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(46), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(47), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(48), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(49), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(50), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(51), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(52), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(53), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(54), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(55), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(56), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(57), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(58), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(59), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(60), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(61), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(62), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(63), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(64), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(65), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(66), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(67), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(68), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(69), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(70), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(71), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(72), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(73), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(74), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(75), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(76), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(77), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(78), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(79), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(80), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(81), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(82), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(83), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(84), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(85), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(86), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(87), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(88), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(89), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(90), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(91), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(92), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(93), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(94), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(95), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(96), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(97), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(98), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(99), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(100), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(101), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(102), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(103), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(104), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(105), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(106), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(107), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(108), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(109), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(110), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(111), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(112), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(113), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(114), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(115), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(116), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(117), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(118), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(119), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(120), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(121), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(122), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(123), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(124), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(125), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(126), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ NULL, DIJOFS_BUTTON(127), DIDFT_OPTIONAL | DIDFT_BUTTON | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_XAxis, FIELD_OFFSET(DIJOYSTATE2, lVX), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_YAxis, FIELD_OFFSET(DIJOYSTATE2, lVY), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_ZAxis, FIELD_OFFSET(DIJOYSTATE2, lVZ), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_RxAxis, FIELD_OFFSET(DIJOYSTATE2, lVRx), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_RyAxis, FIELD_OFFSET(DIJOYSTATE2, lVRy), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_RzAxis, FIELD_OFFSET(DIJOYSTATE2, lVRz), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_Slider, FIELD_OFFSET(DIJOYSTATE2, rglVSlider[0]), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_Slider, FIELD_OFFSET(DIJOYSTATE2, rglVSlider[1]), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_XAxis, FIELD_OFFSET(DIJOYSTATE2, lAX), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_YAxis, FIELD_OFFSET(DIJOYSTATE2, lAY), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_ZAxis, FIELD_OFFSET(DIJOYSTATE2, lAZ), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_RxAxis, FIELD_OFFSET(DIJOYSTATE2, lARx), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_RyAxis, FIELD_OFFSET(DIJOYSTATE2, lARy), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_RzAxis, FIELD_OFFSET(DIJOYSTATE2, lARz), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_Slider, FIELD_OFFSET(DIJOYSTATE2, rglASlider[0]), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_Slider, FIELD_OFFSET(DIJOYSTATE2, rglASlider[1]), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_XAxis, FIELD_OFFSET(DIJOYSTATE2, lFX), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_YAxis, FIELD_OFFSET(DIJOYSTATE2, lFY), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_ZAxis, FIELD_OFFSET(DIJOYSTATE2, lFZ), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_RxAxis, FIELD_OFFSET(DIJOYSTATE2, lFRx), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_RyAxis, FIELD_OFFSET(DIJOYSTATE2, lFRy), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_RzAxis, FIELD_OFFSET(DIJOYSTATE2, lFRz), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_Slider, FIELD_OFFSET(DIJOYSTATE2, rglFSlider[0]), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
	{ &GUID_Slider, FIELD_OFFSET(DIJOYSTATE2, rglFSlider[1]), DIDFT_OPTIONAL | DIDFT_AXIS | DIDFT_ANYINSTANCE, 0 },
};

const DIDATAFORMAT c_dfDIJoystick2 = {
	sizeof(DIDATAFORMAT),
	sizeof(DIOBJECTDATAFORMAT),
	DIDF_ABSAXIS,
	sizeof(DIJOYSTATE2),
	sizeof(dfDIJoystick2) / sizeof(dfDIJoystick2[0]),
	dfDIJoystick2
};
#endif

static BOOL CALLBACK enumDevicesCallback(const DIDEVICEINSTANCE * instance, LPVOID context) {
	struct Gamepad_device * deviceRecord;
	struct Gamepad_devicePrivate * deviceRecordPrivate;
	unsigned int deviceIndex;
	IDirectInputDevice * diDevice;
	IDirectInputDevice8 * di8Device;
	HRESULT result;
	DIPROPDWORD bufferSizeProp;
	bool buffered = true;
	
	if (xInputAvailable && isXInputDevice(&instance->guidProduct)) {
		return DIENUM_CONTINUE;
	}
	
	for (deviceIndex = 0; deviceIndex < numDevices; deviceIndex++) {
		if (!memcmp(&((struct Gamepad_devicePrivate *) devices[deviceIndex]->privateData)->guidInstance, &instance->guidInstance, sizeof(GUID))) {
			return DIENUM_CONTINUE;
		}
	}
	
	result = IDirectInput8_CreateDevice(directInputInterface, &instance->guidInstance, &diDevice, NULL);
	if (result != DI_OK) {
		fprintf(stderr, "Warning: IDirectInput8_CreateDevice returned 0x%X\n", (unsigned int) result);
	}
	result = IDirectInputDevice8_QueryInterface(diDevice, &IID_IDirectInputDevice8, (LPVOID *) &di8Device);
	if (result != DI_OK) {
		fprintf(stderr, "Warning: IDirectInputDevice8_QueryInterface returned 0x%X\n", (unsigned int) result);
	}
	IDirectInputDevice8_Release(diDevice);
	
	result = IDirectInputDevice8_SetCooperativeLevel(di8Device, GetActiveWindow(), DISCL_NONEXCLUSIVE | DISCL_BACKGROUND);
	if (result != DI_OK) {
		fprintf(stderr, "Warning: IDirectInputDevice8_SetCooperativeLevel returned 0x%X\n", (unsigned int) result);
	}
	
	result = IDirectInputDevice8_SetDataFormat(di8Device, &c_dfDIJoystick2);
	if (result != DI_OK) {
		fprintf(stderr, "Warning: IDirectInputDevice8_SetDataFormat returned 0x%X\n", (unsigned int) result);
	}
	
	bufferSizeProp.diph.dwSize = sizeof(DIPROPDWORD);
	bufferSizeProp.diph.dwHeaderSize = sizeof(DIPROPHEADER);
	bufferSizeProp.diph.dwObj = 0;
	bufferSizeProp.diph.dwHow = DIPH_DEVICE;
	bufferSizeProp.dwData = INPUT_QUEUE_SIZE;
	result = IDirectInputDevice8_SetProperty(di8Device, DIPROP_BUFFERSIZE, &bufferSizeProp.diph);
	if (result == DI_POLLEDDEVICE) {
		buffered = false;
	} else if (result != DI_OK) {
		fprintf(stderr, "Warning: IDirectInputDevice8_SetProperty returned 0x%X\n", (unsigned int) result);
	}
	
	deviceRecord = malloc(sizeof(struct Gamepad_device));
	deviceRecordPrivate = malloc(sizeof(struct Gamepad_devicePrivate));
	deviceRecordPrivate->guidInstance = instance->guidInstance;
	deviceRecordPrivate->isXInput = false;
	deviceRecordPrivate->deviceInterface = di8Device;
	deviceRecordPrivate->buffered = buffered;
	deviceRecordPrivate->sliderCount = 0;
	deviceRecordPrivate->povCount = 0;
	deviceRecord->privateData = deviceRecordPrivate;
	deviceRecord->deviceID = nextDeviceID++;
	deviceRecord->description = strdup(instance->tszProductName);
	deviceRecord->vendorID = instance->guidProduct.Data1 & 0xFFFF;
	deviceRecord->productID = instance->guidProduct.Data1 >> 16 & 0xFFFF;
	deviceRecord->numAxes = 0;
	IDirectInputDevice_EnumObjects(di8Device, countAxesCallback, deviceRecord, DIDFT_AXIS | DIDFT_POV);
	deviceRecord->numButtons = 0;
	IDirectInputDevice_EnumObjects(di8Device, countButtonsCallback, deviceRecord, DIDFT_BUTTON);
	deviceRecord->axisStates = calloc(sizeof(float), deviceRecord->numAxes);
	deviceRecord->buttonStates = calloc(sizeof(bool), deviceRecord->numButtons);
	deviceRecordPrivate->axisInfo = calloc(sizeof(struct diAxisInfo), deviceRecord->numAxes);
	deviceRecordPrivate->buttonOffsets = calloc(sizeof(DWORD), deviceRecord->numButtons);
	deviceRecord->numAxes = 0;
	IDirectInputDevice_EnumObjects(di8Device, enumAxesCallback, deviceRecord, DIDFT_AXIS | DIDFT_POV);
	deviceRecord->numButtons = 0;
	IDirectInputDevice_EnumObjects(di8Device, enumButtonsCallback, deviceRecord, DIDFT_BUTTON);
	devices = realloc(devices, sizeof(struct Gamepad_device *) * (numDevices + 1));
	devices[numDevices++] = deviceRecord;
	
	if (Gamepad_deviceAttachCallback != NULL) {
		Gamepad_deviceAttachCallback(deviceRecord, Gamepad_deviceAttachContext);
	}
	
	return DIENUM_CONTINUE;
}

static void removeDevice(unsigned int deviceIndex) {
	if (Gamepad_deviceRemoveCallback != NULL) {
		Gamepad_deviceRemoveCallback(devices[deviceIndex], Gamepad_deviceRemoveContext);
	}
	
	disposeDevice(devices[deviceIndex]);
	numDevices--;
	for (; deviceIndex < numDevices; deviceIndex++) {
		devices[deviceIndex] = devices[deviceIndex + 1];
	}
}

void Gamepad_detectDevices() {
	HRESULT result;
	DWORD xResult;
	XINPUT_CAPABILITIES capabilities;
	unsigned int playerIndex, deviceIndex;
	
	if (!inited) {
		return;
	}
	
	result = IDirectInput_EnumDevices(directInputInterface, DI8DEVCLASS_GAMECTRL, enumDevicesCallback, NULL, DIEDFL_ALLDEVICES);
	if (result != DI_OK) {
		fprintf(stderr, "Warning: IDirectInput_EnumDevices returned 0x%X\n", (unsigned int) result);
	}
	
	if (xInputAvailable) {
		for (playerIndex = 0; playerIndex < 4; playerIndex++) {
			xResult = XInputGetCapabilities_proc(playerIndex, 0, &capabilities);
			if (xResult == ERROR_SUCCESS && registeredXInputDevices[playerIndex] == NULL) {
				struct Gamepad_device * deviceRecord;
				struct Gamepad_devicePrivate * deviceRecordPrivate;
				
				deviceRecord = malloc(sizeof(struct Gamepad_device));
				deviceRecordPrivate = malloc(sizeof(struct Gamepad_devicePrivate));
				deviceRecordPrivate->isXInput = true;
				deviceRecordPrivate->playerIndex = playerIndex;
				deviceRecord->privateData = deviceRecordPrivate;
				deviceRecord->deviceID = nextDeviceID++;
				deviceRecord->description = xInputDeviceNames[playerIndex];
				// HACK: XInput doesn't provide any way to get vendor and product ID, nor any way to map player index to
				// DirectInput device enumeration. All we can do is assume all XInput devices are XBox 360 controllers.
				deviceRecord->vendorID = 0x45E;
				deviceRecord->productID = 0x28E;
				deviceRecord->numAxes = 6;
				deviceRecord->numButtons = 15;
				deviceRecord->axisStates = calloc(sizeof(float), deviceRecord->numAxes);
				deviceRecord->buttonStates = calloc(sizeof(bool), deviceRecord->numButtons);
				devices = realloc(devices, sizeof(struct Gamepad_device *) * (numDevices + 1));
				devices[numDevices++] = deviceRecord;
				registeredXInputDevices[playerIndex] = deviceRecord;
				if (Gamepad_deviceAttachCallback != NULL) {
					Gamepad_deviceAttachCallback(deviceRecord, Gamepad_deviceAttachContext);
				}
				
			} else if (xResult != ERROR_SUCCESS && registeredXInputDevices[playerIndex] != NULL) {
				for (deviceIndex = 0; deviceIndex < numDevices; deviceIndex++) {
					if (devices[deviceIndex] == registeredXInputDevices[playerIndex]) {
						removeDevice(deviceIndex);
						break;
					}
				}
				registeredXInputDevices[playerIndex] = NULL;
			}
		}
	}
}

static void updateButtonValue(struct Gamepad_device * device, unsigned int buttonIndex, bool down, double timestamp) {
	if (down != device->buttonStates[buttonIndex]) {
		device->buttonStates[buttonIndex] = down;
		if (down && Gamepad_buttonDownCallback != NULL) {
			Gamepad_buttonDownCallback(device, buttonIndex, timestamp, Gamepad_buttonDownContext);
		} else if (!down && Gamepad_buttonUpCallback != NULL) {
			Gamepad_buttonUpCallback(device, buttonIndex, timestamp, Gamepad_buttonUpContext);
		}
	}
}

static void updateAxisValueFloat(struct Gamepad_device * device, unsigned int axisIndex, float value, double timestamp) {
	float lastValue;
	
	lastValue = device->axisStates[axisIndex];
	device->axisStates[axisIndex] = value;
	if (value != lastValue && Gamepad_axisMoveCallback != NULL) {
		Gamepad_axisMoveCallback(device, axisIndex, value, lastValue, timestamp, Gamepad_axisMoveContext);
	}
}

static void updateAxisValue(struct Gamepad_device * device, unsigned int axisIndex, LONG ivalue, double timestamp) {
	updateAxisValueFloat(device, axisIndex, (ivalue - AXIS_MIN) / (float) (AXIS_MAX - AXIS_MIN) * 2.0f - 1.0f, timestamp);
}

#define POV_UP 0
#define POV_RIGHT 9000
#define POV_DOWN 18000
#define POV_LEFT 27000

static void povToXY(DWORD pov, float * outX, float * outY) {
	if (LOWORD(pov) == 0xFFFF) {
		*outX = *outY = 0.0f;
		
	} else {
		if (pov > POV_UP && pov < POV_DOWN) {
			*outX = 1.0f;
			
		} else if (pov > POV_DOWN) {
			*outX = -1.0f;
			
		} else {
			*outX = 0.0f;
		}
		
		if (pov > POV_LEFT || pov < POV_RIGHT) {
			*outY = -1.0f;
			
		} else if (pov > POV_RIGHT && pov < POV_LEFT) {
			*outY = 1.0f;
			
		} else {
			*outY = 0.0f;
		}
	}
}

static void updatePOVAxisValues(struct Gamepad_device * device, unsigned int axisIndex, DWORD ivalue, double timestamp) {
	float x = 0.0f, y = 0.0f;
	
	povToXY(ivalue, &x, &y);
	updateAxisValueFloat(device, axisIndex, x, timestamp);
	updateAxisValueFloat(device, axisIndex + 1, y, timestamp);
}

void Gamepad_processEvents() {
	static bool inProcessEvents;
	unsigned int deviceIndex, buttonIndex, axisIndex;
	struct Gamepad_device * device;
	struct Gamepad_devicePrivate * devicePrivate;
	HRESULT result;
	
	if (!inited || inProcessEvents) {
		return;
	}
	
	inProcessEvents = true;
	for (deviceIndex = 0; deviceIndex < numDevices; deviceIndex++) {
		device = devices[deviceIndex];
		devicePrivate = device->privateData;
		
		if (devicePrivate->isXInput) {
			XINPUT_STATE state;
			DWORD xResult;
			
			if (XInputGetStateEx_proc != NULL) {
				XINPUT_STATE_EX stateEx;
				
				xResult = XInputGetStateEx_proc(devicePrivate->playerIndex, &stateEx);
				state.Gamepad.wButtons = stateEx.Gamepad.wButtons;
				state.Gamepad.sThumbLX = stateEx.Gamepad.sThumbLX;
				state.Gamepad.sThumbLY = stateEx.Gamepad.sThumbLY;
				state.Gamepad.sThumbRX = stateEx.Gamepad.sThumbRX;
				state.Gamepad.sThumbRY = stateEx.Gamepad.sThumbRY;
				state.Gamepad.bLeftTrigger = stateEx.Gamepad.bLeftTrigger;
				state.Gamepad.bRightTrigger = stateEx.Gamepad.bRightTrigger;
			} else {
				xResult = XInputGetState_proc(devicePrivate->playerIndex, &state);
			}
			if (xResult == ERROR_SUCCESS) {
				updateButtonValue(device, 0, !!(state.Gamepad.wButtons & XINPUT_GAMEPAD_DPAD_UP), currentTime());
				updateButtonValue(device, 1, !!(state.Gamepad.wButtons & XINPUT_GAMEPAD_DPAD_DOWN), currentTime());
				updateButtonValue(device, 2, !!(state.Gamepad.wButtons & XINPUT_GAMEPAD_DPAD_LEFT), currentTime());
				updateButtonValue(device, 3, !!(state.Gamepad.wButtons & XINPUT_GAMEPAD_DPAD_RIGHT), currentTime());
				updateButtonValue(device, 4, !!(state.Gamepad.wButtons & XINPUT_GAMEPAD_START), currentTime());
				updateButtonValue(device, 5, !!(state.Gamepad.wButtons & XINPUT_GAMEPAD_BACK), currentTime());
				updateButtonValue(device, 6, !!(state.Gamepad.wButtons & XINPUT_GAMEPAD_LEFT_THUMB), currentTime());
				updateButtonValue(device, 7, !!(state.Gamepad.wButtons & XINPUT_GAMEPAD_RIGHT_THUMB), currentTime());
				updateButtonValue(device, 8, !!(state.Gamepad.wButtons & XINPUT_GAMEPAD_LEFT_SHOULDER), currentTime());
				updateButtonValue(device, 9, !!(state.Gamepad.wButtons & XINPUT_GAMEPAD_RIGHT_SHOULDER), currentTime());
				updateButtonValue(device, 10, !!(state.Gamepad.wButtons & XINPUT_GAMEPAD_A), currentTime());
				updateButtonValue(device, 11, !!(state.Gamepad.wButtons & XINPUT_GAMEPAD_B), currentTime());
				updateButtonValue(device, 12, !!(state.Gamepad.wButtons & XINPUT_GAMEPAD_X), currentTime());
				updateButtonValue(device, 13, !!(state.Gamepad.wButtons & XINPUT_GAMEPAD_Y), currentTime());
				updateButtonValue(device, 14, !!(state.Gamepad.wButtons & XINPUT_GAMEPAD_GUIDE), currentTime());
				updateAxisValue(device, 0, state.Gamepad.sThumbLX, currentTime());
				updateAxisValue(device, 1, state.Gamepad.sThumbLY, currentTime());
				updateAxisValue(device, 2, state.Gamepad.sThumbRX, currentTime());
				updateAxisValue(device, 3, state.Gamepad.sThumbRY, currentTime());
				updateAxisValueFloat(device, 4, state.Gamepad.bLeftTrigger / 127.5f - 1.0f, currentTime());
				updateAxisValueFloat(device, 5, state.Gamepad.bRightTrigger / 127.5f - 1.0f, currentTime());
				
			} else {
				registeredXInputDevices[devicePrivate->playerIndex] = NULL;
				removeDevice(deviceIndex);
				deviceIndex--;
				continue;
			}
			
		} else {
			result = IDirectInputDevice8_Poll(devicePrivate->deviceInterface);
			if (result == DIERR_INPUTLOST || result == DIERR_NOTACQUIRED) {
				IDirectInputDevice8_Acquire(devicePrivate->deviceInterface);
				IDirectInputDevice8_Poll(devicePrivate->deviceInterface);
			}
			
			if (devicePrivate->buffered) {
				DWORD eventCount = INPUT_QUEUE_SIZE;
				DIDEVICEOBJECTDATA events[INPUT_QUEUE_SIZE];
				unsigned int eventIndex;
				
				result = IDirectInputDevice8_GetDeviceData(devicePrivate->deviceInterface, sizeof(DIDEVICEOBJECTDATA), events, &eventCount, 0);
				if (result == DIERR_INPUTLOST || result == DIERR_NOTACQUIRED) {
					IDirectInputDevice8_Acquire(devicePrivate->deviceInterface);
					result = IDirectInputDevice8_GetDeviceData(devicePrivate->deviceInterface, sizeof(DIDEVICEOBJECTDATA), events, &eventCount, 0);
				}
				if (!SUCCEEDED(result)) {
					removeDevice(deviceIndex);
					deviceIndex--;
					continue;
				}

				for (eventIndex = 0; eventIndex < eventCount; eventIndex++) {
					for (buttonIndex = 0; buttonIndex < device->numButtons; buttonIndex++) {
						if (events[eventIndex].dwOfs == devicePrivate->buttonOffsets[buttonIndex]) {
							updateButtonValue(device, buttonIndex, !!events[eventIndex].dwData, events[eventIndex].dwTimeStamp / 1000.0);
						}
					}
					for (axisIndex = 0; axisIndex < device->numAxes; axisIndex++) {
						if (events[eventIndex].dwOfs == devicePrivate->axisInfo[axisIndex].offset) {
							if (devicePrivate->axisInfo[axisIndex].isPOV) {
								updatePOVAxisValues(device, axisIndex, events[eventIndex].dwData, events[eventIndex].dwTimeStamp / 1000.0);
								axisIndex++;
							} else {
								updateAxisValue(device, axisIndex, events[eventIndex].dwData, events[eventIndex].dwTimeStamp / 1000.0);
							}
						}
					}
				}
				
			} else {
				DIJOYSTATE2 state;
				
				result = IDirectInputDevice8_GetDeviceState(devicePrivate->deviceInterface, sizeof(DIJOYSTATE2), &state);
				if (result == DIERR_INPUTLOST || result == DIERR_NOTACQUIRED) {
					IDirectInputDevice8_Acquire(devicePrivate->deviceInterface);
					result = IDirectInputDevice8_GetDeviceState(devicePrivate->deviceInterface, sizeof(DIJOYSTATE2), &state);
				}
				
				if (result != DI_OK) {
					removeDevice(deviceIndex);
					deviceIndex--;
					continue;
				}
				
				for (buttonIndex = 0; buttonIndex < device->numButtons; buttonIndex++) {
					updateButtonValue(device, buttonIndex, !!state.rgbButtons[buttonIndex], currentTime());
				}
				
				for (axisIndex = 0; axisIndex < device->numAxes; axisIndex++) {
					switch (devicePrivate->axisInfo[axisIndex].offset) {
						case DIJOFS_X:
							updateAxisValue(device, axisIndex, state.lX, currentTime());
							break;
						case DIJOFS_Y:
							updateAxisValue(device, axisIndex, state.lY, currentTime());
							break;
						case DIJOFS_Z:
							updateAxisValue(device, axisIndex, state.lZ, currentTime());
							break;
						case DIJOFS_RX:
							updateAxisValue(device, axisIndex, state.lRx, currentTime());
							break;
						case DIJOFS_RY:
							updateAxisValue(device, axisIndex, state.lRy, currentTime());
							break;
						case DIJOFS_RZ:
							updateAxisValue(device, axisIndex, state.lRz, currentTime());
							break;
						case DIJOFS_SLIDER(0):
							updateAxisValue(device, axisIndex, state.rglSlider[0], currentTime());
							break;
						case DIJOFS_SLIDER(1):
							updateAxisValue(device, axisIndex, state.rglSlider[1], currentTime());
							break;
						case DIJOFS_POV(0):
							updatePOVAxisValues(device, axisIndex, state.rgdwPOV[0], currentTime());
							axisIndex++;
							break;
						case DIJOFS_POV(1):
							updatePOVAxisValues(device, axisIndex, state.rgdwPOV[1], currentTime());
							axisIndex++;
							break;
						case DIJOFS_POV(2):
							updatePOVAxisValues(device, axisIndex, state.rgdwPOV[2], currentTime());
							axisIndex++;
							break;
						case DIJOFS_POV(3):
							updatePOVAxisValues(device, axisIndex, state.rgdwPOV[3], currentTime());
							axisIndex++;
							break;
					}
				}
			}
		}
	}
	inProcessEvents = false;
}
