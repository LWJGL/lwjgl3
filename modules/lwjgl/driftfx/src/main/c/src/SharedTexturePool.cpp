
#include "SharedTexturePool.h"
#include "SharedTexture.h"
#include <DriftFX/math/Vec2.h>

#include <DriftFX/Context.h>
#include <DriftFX/GL/GLContext.h>

#include <map>
#include <set>

#include <chrono>

#include <utils/Logger.h>

using namespace driftfx;
using namespace driftfx::gl;
using namespace driftfx::math;
using namespace driftfx::internal;

SharedTexturePool::SharedTexturePool(GLContext* glContext, Context* fxContext, ::driftfx::internal::TransferMode* mode) :
	glContext(glContext),
	fxContext(fxContext),
	mode(mode) {

}

SharedTexturePool::~SharedTexturePool() {
	unusedTexturesMutex.lock();
	TexMap::iterator it;
	for (it = unusedTextures.begin(); it != unusedTextures.end(); it++) {
		auto set = &(*it).second;
		TexSet::iterator it2;
		for (it2 = set->begin(); it2 != set->end(); it2++) {
			delete (*it2);
		}
		set->clear();
	}
	unusedTextures.clear();
	unusedTexturesMutex.unlock();
}

void SharedTexturePool::LogContent() {
	auto now = std::chrono::steady_clock::now();
	TexMap::iterator it;
	for (it = unusedTextures.begin(); it != unusedTextures.end(); it++) {
		auto size = (*it).first;
		auto set = (*it).second;
		LogDebug(" * " << size.x << " x " << size.y << ": " << set.size() << " textures:");
		TexSet::iterator it2;
		for (it2 = set.begin(); it2 != set.end(); it2++) {
			auto tex = *it2;

			auto l = lastUsed[tex];

			auto t = std::chrono::duration_cast<std::chrono::milliseconds>(now - l);
			LogDebug("   * " << tex << ": " << tex->ToString() << " (last used " << t.count() << "ms ago)");

			if (t.count() > 1000) {
				LogDebug("     => older than 1s");
			}
		}
	}
}

SharedTexture* SharedTexturePool::AcquireTexture(math::Vec2ui size) {
	SharedTexture* texture = nullptr;

	unusedTexturesMutex.lock();
//	LogDebug("### Before Acquire");
	LogContent();


	if (unusedTextures.find(size) != unusedTextures.end()) {
		if (!unusedTextures[size].empty()) {
			TexSet::iterator first = unusedTextures[size].begin();
			texture = *first;
			LogDebug("Reused Texture: " << texture);
			unusedTextures[size].erase(first);
			LogDebug(" ===> " << unusedTextures[size].size());
		}
	}


//	LogDebug("### After Acquire");
//	LogContent();
	unusedTexturesMutex.unlock();

	if (texture == nullptr) {
		texture = mode->CreateSharedTexture(glContext, fxContext, size);
		LogDebug("Created Texture: " << texture);
	}

	return texture;
}

void SharedTexturePool::ReleaseTexture(SharedTexture* texture) {

	LogDebug("Release Texture: " << texture);
	unusedTexturesMutex.lock();
//	LogDebug("### Before Release");
//	LogContent();

	math::Vec2ui size = texture->GetSize();

	if (unusedTextures.find(size) == unusedTextures.end()) {
		unusedTextures[size] = TexSet();
	}

	unusedTextures[size].insert(texture);

	lastUsed[texture] = std::chrono::steady_clock::now();

//	LogDebug("### After Release");
//	LogContent();
	unusedTexturesMutex.unlock();

}

void SharedTexturePool::DisposeUnusedTextures() {
	LogDebug("DisposeUnusedTextures");
	unusedTexturesMutex.lock();
	auto now = std::chrono::steady_clock::now();

	TexSet toDispose;

	TexMap::iterator it;
	for (it = unusedTextures.begin(); it != unusedTextures.end(); it++) {
		auto size = (*it).first;
		auto set = &(*it).second;
		LogDebug(" * " << size.x << " x " << size.y);
		TexSet::iterator it2;
		for (it2 = set->begin(); it2 != set->end(); it2++) {
			auto tex = *it2;

			auto l = lastUsed[tex];

			auto t = std::chrono::duration_cast<std::chrono::milliseconds>(now - l);
			LogDebug("   * " << tex << ": " << tex->ToString() << " (last used " << t.count() << "ms ago)");

			if (t.count() > 1000) {
				it2 = set->erase(it2);
				toDispose.insert(tex);
				LogDebug("     => marking for disposal");
				if (it2 == set->end()){
					break;
				}
			}
		}
		if (set->empty()) {
			it = unusedTextures.erase(it);
			if (it == unusedTextures.end()) {
				break;
			}
		}
	}

	TexSet::iterator disp;
	for (disp = toDispose.begin(); disp != toDispose.end(); disp++) {
		auto tex = (*disp);
		LogDebug("deleting " << tex);
		delete tex;
	}


	// TODO delete stuff
	unusedTexturesMutex.unlock();
}
