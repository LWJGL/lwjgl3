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

#include "Error.h"

#include <string>

std::string ToString(DWORD err) {
	if (err == 0) {
		return std::string();
	}

	LPSTR msgBuf = nullptr;
	size_t size = FormatMessageA(FORMAT_MESSAGE_ALLOCATE_BUFFER | FORMAT_MESSAGE_FROM_SYSTEM | FORMAT_MESSAGE_IGNORE_INSERTS,
			NULL, err, MAKELANGID(LANG_ENGLISH, SUBLANG_DEFAULT), (LPSTR)&msgBuf, 0, NULL);
	std::string msg(msgBuf, size);

	LocalFree(msgBuf);

	return msg;
}




