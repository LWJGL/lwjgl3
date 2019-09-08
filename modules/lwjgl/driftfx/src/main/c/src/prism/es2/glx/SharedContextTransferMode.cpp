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

#include <TransferModeManager.h>

#include <GL/glew.h>

#include <prism/es2/glx/GLXSharedTexture.h>

#include <utils/Logger.h>

#include <DriftFX/GL/GLDebug.h>

#include <DriftFX/math/Vec2.h>

#include <prism/PrismBridge.h>
#include <prism/es2/ES2PrismBridge.h>

#include <gl/GLLog.h>


namespace driftfx {
namespace internal {
namespace prism {
namespace es2 {
namespace glx {
	
class SharedContextTransferMode : public TransferMode {
	public:
	SharedTexture* CreateSharedTexture(GLContext* glContext, Context* fxContext, math::Vec2ui size) {
		GLContext* fxGlContext = static_cast<GLContext*>(fxContext);
		return new GLXSharedTexture(glContext, fxGlContext, size);
	}
	int OnTextureCreated(prism::PrismBridge* bridge, Frame* frame, jobject fxTexture) {
		frame->Begin("SharedContextTransferMode#OnTextureCreated");
		LogDebug("OnTextureCreated " << bridge << ", " << frame << ", " << fxTexture);

			ES2PrismBridge* es2Bridge = static_cast<ES2PrismBridge*>(bridge);
			ShareData* data = frame->GetData();
			GLXShareData* shareData = (GLXShareData*) data;
			auto size = frame->GetSize();
			GLuint targetTex = es2Bridge->GetGLTextureName(fxTexture);
//			ES2PrismBridge::CopyTexture(shareData->textureName, targetTex, size.x, size.y);

			GLuint width = size.x;
			GLuint height = size.y;
			GLuint sourceTex = shareData->textureName;

			// COPY OVER
			GLuint fbos[2];

			GLCALL( glGenFramebuffers(2, &fbos[0]) );

			GLCALL( glBindFramebuffer(GL_READ_FRAMEBUFFER, fbos[0]) );
			GLCALL( glFramebufferTexture(GL_READ_FRAMEBUFFER, GL_COLOR_ATTACHMENT0, sourceTex, 0) );

			GLCALL( glBindFramebuffer(GL_DRAW_FRAMEBUFFER, fbos[1]); );
			GLCALL( glFramebufferTexture(GL_DRAW_FRAMEBUFFER, GL_COLOR_ATTACHMENT0, targetTex, 0) );

			GLCALL( glClearColor(0, 0, 0, 0) );
			GLCALL( glClear(GL_COLOR_BUFFER_BIT) );

			GLCALL( glBlitFramebuffer(0, 0, width, height, 0, 0, width, height, GL_COLOR_BUFFER_BIT, GL_LINEAR) );


			GLCALL( glFlush() );

			GLCALL( glDeleteFramebuffers(2, &fbos[0]) );


			// We need to wait here for the blit operation to finish to prevent copying an empty texture in FX context
			//GLCALL( glFinish() );
//			GLsync fence;
//			GLCALL( fence = glFenceSync(GL_SYNC_GPU_COMMANDS_COMPLETE, 0) );
//			GLCALL( glFlush() );
//			GLCALL( glWaitSync(fence, 0, GL_TIMEOUT_IGNORED) );
//			GLCALL( glDeleteSync( fence ) );


			frame->End("SharedContextTransferMode#OnTextureCreated");
			return 0;
	}
	virtual bool isPlatformDefault() {
		return true;
	}
	protected:
	SharedContextTransferMode() : TransferMode("SharedContext") {}
	static TransferModeId registered;
};

TransferModeId SharedContextTransferMode::registered = TransferModeManager::Instance()->RegisterTransferMode(new SharedContextTransferMode());

}
}
}
}
}
