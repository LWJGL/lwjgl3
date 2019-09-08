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
 
#ifndef CONFIGURATION_H_
#define CONFIGURATION_H_

namespace driftfx {
namespace internal {

class Configuration {

public:
	static bool IsDebug();

	static void Initialize();

	static int GetLogLevel();

	static bool IsUseWinFallback();

	static const int LEVEL_DEBUG = 0;
	static const int LEVEL_INFO = 1;
	static const int LEVEL_WARNING = 2;
	static const int LEVEL_ERROR = 3;

	
private:
	static bool debug;
	static int logLevel;
	static bool useWinFallback;

};

}
}

#endif /* CONFIGURATION_H_ */
