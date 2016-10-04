//
// Copyright (c) 2009-2013 Mikko Mononen memon@inside.org
//
// This software is provided 'as-is', without any express or implied
// warranty.  In no event will the authors be held liable for any damages
// arising from the use of this software.
// Permission is granted to anyone to use this software for any purpose,
// including commercial applications, and to alter it and redistribute it
// freely, subject to the following restrictions:
// 1. The origin of this software must not be misrepresented; you must not
//    claim that you wrote the original software. If you use this software
//    in a product, an acknowledgment in the product documentation would be
//    appreciated but is not required.
// 2. Altered source versions must be plainly marked as such, and must not be
//    misrepresented as being the original software.
// 3. This notice may not be removed or altered from any source distribution.
//
#ifndef NANOVG_GL_UTILS_H
#define NANOVG_GL_UTILS_H

#if defined NANOVG_GL2
	#define EXT(name) name##GL2
#elif defined NANOVG_GL3
	#define EXT(name) name##GL3
#elif defined NANOVG_GLES2
	#define EXT(name) name##GLES2
#elif defined NANOVG_GLES3
	#define EXT(name) name##GLES3
#endif

struct NVGLUframebuffer {
	GLuint fbo;
	GLuint rbo;
	GLuint texture;
	int image;
};
typedef struct NVGLUframebuffer NVGLUframebuffer;

// Helper function to create GL frame buffer to render to.
void EXT(nvgluBindFramebuffer)(NVGcontext* ctx, NVGLUframebuffer* fb);
NVGLUframebuffer* EXT(nvgluCreateFramebuffer)(NVGcontext* ctx, int w, int h, int imageFlags);
void EXT(nvgluDeleteFramebuffer)(NVGcontext* ctx, NVGLUframebuffer* fb);

#endif // NANOVG_GL_UTILS_H

#ifdef NANOVG_GL_IMPLEMENTATION

static GLint defaultFBO = -1;

NVGLUframebuffer* EXT(nvgluCreateFramebuffer)(NVGcontext* ctx, int w, int h, int imageFlags)
{
	GLNVGcontext* gl = (GLNVGcontext*)((NVGparams*)ctx)->userPtr;
	GLint defaultFBO;
	GLint defaultRBO;
	NVGLUframebuffer* fb = NULL;

	gl->GetIntegerv(GL_FRAMEBUFFER_BINDING, &defaultFBO);
	gl->GetIntegerv(GL_RENDERBUFFER_BINDING, &defaultRBO);

	fb = (NVGLUframebuffer*)malloc(sizeof(NVGLUframebuffer));
	if (fb == NULL) goto error;
	memset(fb, 0, sizeof(NVGLUframebuffer));

	fb->image = nvgCreateImageRGBA(ctx, w, h, imageFlags | NVG_IMAGE_FLIPY | NVG_IMAGE_PREMULTIPLIED, NULL);

	fb->texture = EXT(nvglImageHandle)(ctx, fb->image);

	// frame buffer object
	gl->GenFramebuffers(1, &fb->fbo);
	gl->BindFramebuffer(GL_FRAMEBUFFER, fb->fbo);

	// render buffer object
	gl->GenRenderbuffers(1, &fb->rbo);
	gl->BindRenderbuffer(GL_RENDERBUFFER, fb->rbo);
	gl->RenderbufferStorage(GL_RENDERBUFFER, GL_STENCIL_INDEX8, w, h);

	// combine all
	gl->FramebufferTexture2D(GL_FRAMEBUFFER, GL_COLOR_ATTACHMENT0, GL_TEXTURE_2D, fb->texture, 0);
	gl->FramebufferRenderbuffer(GL_FRAMEBUFFER, GL_STENCIL_ATTACHMENT, GL_RENDERBUFFER, fb->rbo);

	if (gl->CheckFramebufferStatus(GL_FRAMEBUFFER) != GL_FRAMEBUFFER_COMPLETE) goto error;

	gl->BindFramebuffer(GL_FRAMEBUFFER, defaultFBO);
	gl->BindRenderbuffer(GL_RENDERBUFFER, defaultRBO);
	return fb;
error:
	gl->BindFramebuffer(GL_FRAMEBUFFER, defaultFBO);
	gl->BindRenderbuffer(GL_RENDERBUFFER, defaultRBO);
	EXT(nvgluDeleteFramebuffer)(ctx, fb);
	return NULL;
}

void EXT(nvgluBindFramebuffer)(NVGcontext* ctx, NVGLUframebuffer* fb)
{
	GLNVGcontext* gl = (GLNVGcontext*)((NVGparams*)ctx)->userPtr;
	if (defaultFBO == -1) gl->GetIntegerv(GL_FRAMEBUFFER_BINDING, &defaultFBO);
	gl->BindFramebuffer(GL_FRAMEBUFFER, fb != NULL ? fb->fbo : (GLuint)defaultFBO);
}

void EXT(nvgluDeleteFramebuffer)(NVGcontext* ctx, NVGLUframebuffer* fb)
{
	GLNVGcontext* gl = (GLNVGcontext*)((NVGparams*)ctx)->userPtr;
	if (fb == NULL) return;
	if (fb->fbo != 0)
		gl->DeleteFramebuffers(1, &fb->fbo);
	if (fb->rbo != 0)
		gl->DeleteRenderbuffers(1, &fb->rbo);
	if (fb->image >= 0)
		nvgDeleteImage(ctx, fb->image);
	fb->fbo = 0;
	fb->rbo = 0;
	fb->texture = 0;
	fb->image = -1;
	free(fb);
}

#endif // NANOVG_GL_IMPLEMENTATION
