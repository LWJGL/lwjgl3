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

#include <string>

#ifndef DRIFTFX_TRANSFERMODE_H_
#define DRIFTFX_TRANSFERMODE_H_

namespace driftfx {

typedef unsigned int TransferModeId;

class TransferMode {
public:
	virtual TransferModeId Id() = 0;
	virtual std::string Name() = 0;
};

}

#endif /* DRIFTFX_TRANSFERMODE_H_ */
