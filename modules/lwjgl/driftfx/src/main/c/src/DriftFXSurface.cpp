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

#include <DriftFX/TransferMode.h>
#include <DriftFX/DriftFXSurface.h>

#include <TransferModeManager.h>

using namespace driftfx;

DriftFXSurface::~DriftFXSurface() {

}


std::list<TransferMode*> DriftFXSurface::GetAvailableTransferModes() {
	std::list<TransferMode*> result;
	std::list<internal::TransferMode*> modes = internal::TransferModeManager::Instance()->GetAvailableModes();
	for (auto it = modes.begin(); it != modes.end(); it++) {
		result.push_back(*it);
	}
	return result;
}
TransferMode* DriftFXSurface::GetPlatformDefaultTransferMode() {
	return internal::TransferModeManager::Instance()->GetPlatformDefault();
}
TransferMode* DriftFXSurface::GetFallbackTransferMode() {
	return internal::TransferModeManager::Instance()->GetFallback();
}
