//-------------------------------------------------------------------------------------
// scoped.h
//  
// Utility header with helper classes for exception-safe handling of resources
//
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//-------------------------------------------------------------------------------------

#pragma once

#include <assert.h>
#include <memory>
#include <malloc.h>

//---------------------------------------------------------------------------------
struct aligned_deleter { void operator()(void* p) noexcept { _aligned_free(p); } };

using ScopedAlignedArrayFloat = std::unique_ptr<float[], aligned_deleter>;

using ScopedAlignedArrayXMVECTOR = std::unique_ptr<DirectX::XMVECTOR[], aligned_deleter>;
//---------------------------------------------------------------------------------
struct handle_closer { void operator()(HANDLE h) noexcept { assert(h != INVALID_HANDLE_VALUE); if (h) CloseHandle(h); } };

using ScopedHandle = std::unique_ptr<void, handle_closer>;

inline HANDLE safe_handle(HANDLE h) noexcept { return (h == INVALID_HANDLE_VALUE) ? nullptr : h; }
