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

#ifndef SHAREDSURFACE_WIN32_ERROR_H_
#define SHAREDSURFACE_WIN32_ERROR_H_

#include "../Common.h"

#include <windows.h>

#include <string>
#include <iostream>
#include <iomanip>

#define WERR(errcode) errcode; { DWORD err = GetLastError(); SetLastError(0); if (err != 0) LogError("Windows Error 0x" << std::hex << HRESULT_CODE(err) << " (" << #errcode ")" << std::endl << "Message: " << ::ToString(HRESULT_CODE(err))) }

std::string ToString(DWORD err);

#endif /* SHAREDSURFACE_WIN32_ERROR_H_ */
