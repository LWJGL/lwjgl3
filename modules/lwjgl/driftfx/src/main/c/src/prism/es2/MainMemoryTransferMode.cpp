
#include <prism/PrismBridge.h>
#include <SharedTexture.h>
#include <MainMemorySharedTexture.h>
#include <functional>

#include <utils/Logger.h>

#include "ES2PrismBridge.h"

#include <jni.h>

namespace driftfx {
namespace internal {
namespace prism {
namespace es2 {

using namespace std::placeholders;


class MainMemoryTransferMode : TransferMode {
public:
	SharedTexture* CreateSharedTexture(GLContext* glContext, Context* fxContext, math::Vec2ui size) {
    	return new MainMemorySharedTexture(glContext, size);
	}
	int OnTextureCreated(prism::PrismBridge* bridge, Frame* frame, jobject fxTexture) {
		frame->Begin("MainMemoryTransferMode#OnTextureCreated");
		//LogDebug("OnTextureCreated(" << bridge << ", " << frame << ", " << fxTexture << ")");

		ES2PrismBridge* es2Bridge = static_cast<ES2PrismBridge*>(bridge);

		//LogDebug("Context is " << es2Bridge->GetFXSharedGLContext());

		// context is important
		es2Bridge->GetFXSharedGLContext()->SetCurrent();


		GLuint targetTex = es2Bridge->GetGLTextureName(fxTexture);
		auto t = frame->GetSharedTexture();
		if (t == nullptr) {
			return -1;
		}

		ShareData* data = frame->GetData();
		MainMemoryShareData* memData = (MainMemoryShareData*) data;

		es2Bridge->UploadTexture(targetTex, frame->GetWidth(), frame->GetHeight(), memData->pointer, memData->length);

		frame->End("MainMemoryTransferMode#OnTextureCreated");
		return 0;
    }
	virtual bool isFallback() {
		return true;
	}
protected:
	MainMemoryTransferMode() : TransferMode("MainMemory") {}
	static TransferModeId registered;
};

TransferModeId MainMemoryTransferMode::registered = TransferModeManager::Instance()->RegisterTransferMode(new MainMemoryTransferMode());

}
}
}
}
