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


#ifndef DRIFTFX_TRANSFERMODEMANAGER_H_
#define DRIFTFX_TRANSFERMODEMANAGER_H_

#include <jni.h>

#include <map>
#include <list>
#include <string>

#include <DriftFX/TransferMode.h>

#include <SharedTexture.h>

namespace driftfx {
namespace internal {

	namespace prism {
		class PrismBridge;
	}

	typedef unsigned int TransferModeId;

	class TransferMode : public ::driftfx::TransferMode {
	public:
		virtual ~TransferMode();
		std::string Name();
		TransferModeId Id();
		virtual SharedTexture* CreateSharedTexture(GLContext*, Context*, math::Vec2ui size) = 0;
		virtual int OnTextureCreated(prism::PrismBridge*, Frame*, jobject) = 0;
		virtual bool isPlatformDefault();
		virtual bool isFallback();

		// this method is internal, it is set by TransferModeManager
		void SetId(TransferModeId id);
	protected:
		TransferMode(std::string name);
	private:
		std::string name;
		TransferModeId id;
	};


	class TransferModeManager {

	public:

		static TransferModeManager* Instance();

		TransferModeId RegisterTransferMode(TransferMode* mode);
		TransferMode* GetTransferMode(TransferModeId id);

		TransferMode* GetPlatformDefault();
		TransferMode* GetFallback();

		std::list<TransferMode*> GetAvailableModes();

	private:
		TransferModeManager();
		virtual ~TransferModeManager();

		std::map<TransferModeId, TransferMode*> transferModes;
		TransferModeId nextId;

		static TransferModeManager* instance;

	};

}
}


#endif
