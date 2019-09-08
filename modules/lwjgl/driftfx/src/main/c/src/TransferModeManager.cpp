#include "TransferModeManager.h"

#include <utils/Logger.h>
#include <iostream>

using namespace driftfx::internal;

TransferMode::~TransferMode() {
}

TransferMode::TransferMode(std::string name) :
	name(name),
	id(-1) {
	
}

TransferModeId TransferMode::Id() {
	return id;
}

void TransferMode::SetId(TransferModeId id) {
	this->id = id;
}

bool TransferMode::isFallback() {
	return false;
}

bool TransferMode::isPlatformDefault() {
	return false;
}

std::string TransferMode::Name() {
	return name;
}



TransferModeManager* TransferModeManager::instance = nullptr;

TransferModeManager::TransferModeManager() :
	transferModes(),
	nextId(0) {

}
TransferModeManager::~TransferModeManager() {

}

TransferMode* TransferModeManager::GetPlatformDefault() {
	std::map<TransferModeId, TransferMode*>::iterator it = transferModes.begin();

	while (it != transferModes.end()) {
		auto mode = it->second;
		if (mode->isPlatformDefault()) {
			return mode;
		}
		it++;
	}

	return nullptr;
}

TransferMode* TransferModeManager::GetFallback() {
	std::map<TransferModeId, TransferMode*>::iterator it = transferModes.begin();

	while (it != transferModes.end()) {
		auto mode = it->second;
		if (mode->isFallback()) {
			return mode;
		}
		it++;
	}

	return nullptr;
}

TransferModeManager* TransferModeManager::Instance() {
	if (instance == nullptr) {
		instance = new TransferModeManager();
	}
	return instance;
}

TransferModeId TransferModeManager::RegisterTransferMode(TransferMode* transferMode) {
	TransferModeId id = nextId++;
	LogInfo("Registering TransferMode Instance '" << transferMode->Name() << "' as " << id);
	transferModes[id] = transferMode;
	transferMode->SetId(id);
	return id;
}

TransferMode* TransferModeManager::GetTransferMode(TransferModeId id)
{
	return transferModes[id];
}


std::list<TransferMode*> TransferModeManager::GetAvailableModes() {
	std::list<TransferMode*> result;
	for (std::map<TransferModeId, TransferMode*>::iterator it = transferModes.begin(); it != transferModes.end(); it++) {
		result.push_back(it->second);
	}
	return result;
}


