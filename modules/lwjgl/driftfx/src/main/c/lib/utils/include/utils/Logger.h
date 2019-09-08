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

#ifndef UTILS_LOGGER_H_
#define UTILS_LOGGER_H_

#include <iostream>
#include <ostream>
#include <sstream>
#include <string>

enum LogLevel { Debug, Error, Warning, Info };

std::ostream& operator<<(std::ostream& ostr, const LogLevel& level);
std::ostream& Log(LogLevel level, std::string file, int line, std::string func);
void Log(LogLevel level, std::string file, int line, std::string func, std::string message);

void LogSetEnabled(LogLevel level, bool enable);

#define WITH_LOGGING 0

#ifndef __PRETTY_FUNCTION__
  #define __PRETTY_FUNCTION__ __FUNCTION__
#endif

#ifdef WITH_LOGGING

#define LogDebug(msg) { std::ostringstream logmsg; logmsg << msg << std::endl; Log(Debug, __FILE__, __LINE__, __PRETTY_FUNCTION__, logmsg.str()); }
#define LogError(msg) { std::ostringstream logmsg; logmsg << msg << std::endl; Log(Error, __FILE__, __LINE__, __PRETTY_FUNCTION__, logmsg.str()); }
#define LogInfo(msg) { std::ostringstream logmsg; logmsg << msg << std::endl; Log(Info, __FILE__, __LINE__, __PRETTY_FUNCTION__, logmsg.str()); }
#define LogWarning(msg) { std::ostringstream logmsg; logmsg << msg << std::endl; Log(Warning, __FILE__, __LINE__, __PRETTY_FUNCTION__, logmsg.str()); }

//#define LogDebug(msg) Log(Debug, __FILE__, __LINE__, __PRETTY_FUNCTION__) << msg << std::endl;
//#define LogError(msg) Log(Error, __FILE__, __LINE__, __PRETTY_FUNCTION__) << msg << std::endl;
//#define LogInfo(msg) Log(Info, __FILE__, __LINE__, __PRETTY_FUNCTION__) << msg << std::endl;
//#define LogWarning(msg) Log(Warning, __FILE__, __LINE__, __PRETTY_FUNCTION__) << msg << std::endl;

#else
#define LogDebug(msg)
#define LogError(msg)
#define LogInfo(msg)
#define LogWarning(msg)
#endif


#endif /* COMMON_H_ */
