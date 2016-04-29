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

#ifndef __GAMEPAD_PRIVATE_H__
#define __GAMEPAD_PRIVATE_H__

enum Gamepad_eventType {
	GAMEPAD_EVENT_DEVICE_ATTACHED,
	GAMEPAD_EVENT_DEVICE_REMOVED,
	GAMEPAD_EVENT_BUTTON_DOWN,
	GAMEPAD_EVENT_BUTTON_UP,
	GAMEPAD_EVENT_AXIS_MOVED
};

struct Gamepad_buttonEvent {
	// Device that generated the event
	struct Gamepad_device * device;
	
	// Relative time of the event, in seconds
	double timestamp;
	
	// Button being pushed or released
	unsigned int buttonID;
	
	// True if button is down
	bool down;
};

struct Gamepad_axisEvent {
	// Device that generated the event
	struct Gamepad_device * device;
	
	// Relative time of the event, in seconds
	double timestamp;
	
	// Axis being moved
	unsigned int axisID;
	
	// Axis position value, in the range [-1..1]
	float value;
	
	// Previous axis position value, in the range [-1..1]
	float lastValue;
};

extern void (* Gamepad_deviceAttachCallback)(struct Gamepad_device * device, void * context);
extern void (* Gamepad_deviceRemoveCallback)(struct Gamepad_device * device, void * context);
extern void (* Gamepad_buttonDownCallback)(struct Gamepad_device * device, unsigned int buttonID, double timestamp, void * context);
extern void (* Gamepad_buttonUpCallback)(struct Gamepad_device * device, unsigned int buttonID, double timestamp, void * context);
extern void (* Gamepad_axisMoveCallback)(struct Gamepad_device * device, unsigned int axisID, float value, float lastValue, double timestamp, void * context);
extern void * Gamepad_deviceAttachContext;
extern void * Gamepad_deviceRemoveContext;
extern void * Gamepad_buttonDownContext;
extern void * Gamepad_buttonUpContext;
extern void * Gamepad_axisMoveContext;

#endif
