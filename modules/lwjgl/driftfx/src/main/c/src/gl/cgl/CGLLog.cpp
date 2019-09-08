/*
 * Copyright (c) 2019 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 */

#include <OpenGL/CGLContext.h>
#include <OpenGL/CGLTypes.h>
#include <OpenGL/CGLDevice.h>
#include <string>
#include <sstream>
#include <iostream>

#include "CGLLog.h"

#include <utils/Logger.h>

using namespace std;

string driftfx::gl::cgl::ToString(CGLError err) {
	switch (err) {
		case kCGLBadAttribute:
			return "[CGLError] 10000 kCGLBadAttribute (Invalid pixel format attribute.)";
		case kCGLBadProperty:
			return "[CGLError] 10001 kCGLBadProperty (Invalid renderer property.)";
			break;
		case kCGLBadPixelFormat:
			return "[CGLError] 10002 kCGLBadPixelFormat:  (Invalid pixel fomat object.)";
			break;
		case kCGLBadRendererInfo:
			return "[CGLError] 10003 kCGLBadRendererInfo:  (Invalid renderer information object.)";
			break;
		case kCGLBadContext:
			return "[CGLError] 10004 kCGLBadContext:  (Invalid context object.)";
			break;
		case kCGLBadDrawable:
			return "[CGLError] 10005 kCGLBadDrawable:  (Invalid drawable.)";
			break;
		case kCGLBadDisplay:
			return "[CGLError] 10006 kCGLBadDisplay: (Invalid display.)";
			break;
		case kCGLBadState:
			return "[CGLError] 10007 kCGLBadState: (Invalid context state.)";
			break;
		case kCGLBadValue:
			return "[CGLError] 10008 kCGLBadValue: (Invalid numerical value.)";
			break;
		case kCGLBadMatch:
			return "[CGLError] 10009 kCGLBadMatch: (Invalid share context.)";
			break;
		case kCGLBadEnumeration:
			return "[CGLError] 10010 kCGLBadEnumeration: (Invalid share enumerant. This error is caused by the use of an invalid constant.)";
			break;
		case kCGLBadOffScreen:
			return "[CGLError] 10011 kCGLBadOffScreen: (Invalid off-screen drawable.)";
			break;
		case kCGLBadFullScreen:
			return "[CGLError] 10012 kCGLBadFullScreen: (Invalid full-screen drawable.)";
			break;
		case kCGLBadWindow:
			return "[CGLError] 10013 kCGLBadWindow: (Invalid window.)";
			break;
		case kCGLBadAddress:
			return "[CGLError] 10014 kCGLBadAddress: (Invalid memory address. This error occurs when you pass an invalid pointer into a function that requires a non-NULL memory address.)";
			break;
		case kCGLBadCodeModule:
			return "[CGLError] 10015 kCGLBadCodeModule: (Invalid code module.)";
			break;
		case kCGLBadAlloc:
			return "[CGLError] 10016 kCGLBadAlloc: (Invalid memory allocation. This error occurs when CGL is unable to allocate memory.)";
			break;
		case kCGLBadConnection:
			return "[CGLError] 10017 kCGLBadConnection: (Invalid Core Graphics connection.)";
			break;
		default:
			ostringstream r;
			r << "Unknown CGLError " << hex << err;
			return r.str();
	}


}

void driftfx::gl::cgl::CheckCGLError(CGLError error, string call, string file, int line, string func) {
	if (kCGLNoError != error) {
		ostringstream s;
		s	 << "CGL Error occurred! " << driftfx::gl::cgl::ToString(error) << ":" << endl
		     << " CGL call: " << call << endl
			 << " Location: " << file << ";" << line << endl
			 << " Function: " << func << endl;
		Log(Error, file, line, call) << s.str();
	}
}



