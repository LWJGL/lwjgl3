//-------------------------------------------------------------------------------------
// DirectXMeshP.h
//
// DirectX Mesh Geometry Library
//
// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.
//
// http://go.microsoft.com/fwlink/?LinkID=324981
//-------------------------------------------------------------------------------------

#pragma once

// Off by default warnings
#pragma warning(disable : 4619 4616 4061 4365 4514 4571 4623 4625 4626 4628 4668 4710 4711 4746 4774 4820 4987 5026 5027 5031 5032 5039 5045 5219 5246 26812)
// C4619/4616 #pragma warning warnings
// C4061 enumerator 'X' in switch of enum 'X' is not explicitly handled by a case label
// C4365 signed/unsigned mismatch
// C4514 unreferenced inline function has been removed
// C4571 behavior change
// C4623 default constructor was implicitly defined as deleted
// C4625 copy constructor was implicitly defined as deleted
// C4626 assignment operator was implicitly defined as deleted
// C4628 digraphs not supported
// C4668 not defined as a preprocessor macro
// C4710 function not inlined
// C4711 selected for automatic inline expansion
// C4746 volatile access of '<expression>' is subject to /volatile:<iso|ms> setting
// C4774 format string expected in argument 3 is not a string literal
// C4820 padding added after data member
// C4987 nonstandard extension used
// C5026 move constructor was implicitly defined as deleted
// C5027 move assignment operator was implicitly defined as deleted
// C5031/5032 push/pop mismatches in windows headers
// C5039 pointer or reference to potentially throwing function passed to extern C function under - EHc
// C5045 Spectre mitigation warning
// C5219 implicit conversion from 'int' to 'float', possible loss of data
// C5246 the initialization of a subobject should be wrapped in braces
// 26812: The enum type 'x' is unscoped. Prefer 'enum class' over 'enum' (Enum.3).

// Windows 8.1 SDK related Off by default warnings
#pragma warning(disable : 4471 4917 4986 5029)
// C4471 forward declaration of an unscoped enumeration must have an underlying type
// C4917 a GUID can only be associated with a class, interface or namespace
// C4986 exception specification does not match previous declaration
// C5029 nonstandard extension used

// Xbox One XDK related Off by default warnings
#pragma warning(disable : 4643)
// C4643 Forward declaring in namespace std is not permitted by the C++ Standard

#ifdef __clang__
#pragma clang diagnostic ignored "-Wc++98-compat"
#pragma clang diagnostic ignored "-Wc++98-compat-pedantic"
#pragma clang diagnostic ignored "-Wc++98-compat-local-type-template-args"
#pragma clang diagnostic ignored "-Wcovered-switch-default"
#pragma clang diagnostic ignored "-Wfloat-equal"
#pragma clang diagnostic ignored "-Wreserved-id-macro"
#endif

#ifdef _WIN32
#ifndef WIN32_LEAN_AND_MEAN
#define WIN32_LEAN_AND_MEAN
#endif

#pragma warning(push)
#pragma warning(disable : 4005)
#define NOMINMAX 1
#define NODRAWTEXT
#define NOGDI
#define NOBITMAP
#define NOMCX
#define NOSERVICE
#define NOHELP
#pragma warning(pop)

#include <Windows.h>

#ifdef __MINGW32__
#include <unknwn.h>
#endif

#ifndef _WIN32_WINNT_WIN10
#define _WIN32_WINNT_WIN10 0x0A00
#endif

#ifdef _GAMING_XBOX_SCARLETT
#pragma warning(push)
#pragma warning(disable: 5204 5249)
#include <d3d12_xs.h>
#pragma warning(pop)
#elif defined(_GAMING_XBOX)
#pragma warning(push)
#pragma warning(disable: 5204)
#include <d3d12_x.h>
#pragma warning(pop)
#elif defined(_XBOX_ONE) && defined(_TITLE)
#include <d3d12_x.h>
#include <d3d11_x.h>
#elif (_WIN32_WINNT >= _WIN32_WINNT_WIN10)
#ifdef USING_DIRECTX_HEADERS
#include <directx/dxgiformat.h>
#include <directx/d3d12.h>
#else
#include <d3d12.h>
#endif
#include <d3d11_4.h>
#else
#include <d3d11_1.h>
#endif
#else // !WIN32
#include <wsl/winadapter.h>
#include <wsl/wrladapter.h>
#include <directx/d3d12.h>
#endif

#include <array>
#include <algorithm>
#include <cassert>
#include <cmath>
#include <cstdlib>
#include <cstring>
#include <cwchar>
#include <map>
#include <new>
#include <string>
#include <tuple>
#include <unordered_map>
#include <unordered_set>

#ifndef _WIN32
#include <mutex>
#endif

#define _XM_NO_XMVECTOR_OVERLOADS_

#include "DirectXMesh.h"

#include <malloc.h>

#include "scoped.h"

#ifndef XBOX_DXGI_FORMAT_R10G10B10_SNORM_A2_UNORM
#define XBOX_DXGI_FORMAT_R10G10B10_SNORM_A2_UNORM DXGI_FORMAT(189)
#endif

// HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW)
#define HRESULT_E_ARITHMETIC_OVERFLOW static_cast<HRESULT>(0x80070216L)

// HRESULT_FROM_WIN32(ERROR_NOT_SUPPORTED)
#define HRESULT_E_NOT_SUPPORTED static_cast<HRESULT>(0x80070032L)

// HRESULT_FROM_WIN32(ERROR_INVALID_NAME)
#define HRESULT_E_INVALID_NAME static_cast<HRESULT>(0x8007007BL)

// E_BOUNDS
#ifndef E_BOUNDS
#define E_BOUNDS static_cast<HRESULT>(0x8000000BL)
#endif

namespace DirectX
{
    //---------------------------------------------------------------------------------
    constexpr uint32_t UNUSED32 = uint32_t(-1);

#if (defined(__d3d11_h__) || defined(__d3d11_x_h__)) && !defined(__MINGW32__)
    static_assert(D3D11_16BIT_INDEX_STRIP_CUT_VALUE == uint16_t(-1), "Mismatch with Direct3D11");
    static_assert(D3D11_16BIT_INDEX_STRIP_CUT_VALUE == UINT16_MAX, "Mismatch with Direct3D11");

    static_assert(D3D11_32BIT_INDEX_STRIP_CUT_VALUE == uint32_t(-1), "Mismatch with Direct3D11");
    static_assert(D3D11_32BIT_INDEX_STRIP_CUT_VALUE == UINT32_MAX, "Mismatch with Direct3D11");
#endif

#if defined(__d3d12_h__) || defined(__d3d12_x_h__) || defined(__XBOX_D3D12_X__)
    static_assert(D3D12_16BIT_INDEX_STRIP_CUT_VALUE == uint16_t(-1), "Mismatch with Direct3D12");
    static_assert(D3D12_16BIT_INDEX_STRIP_CUT_VALUE == UINT16_MAX, "Mismatch with Direct3D12");

    static_assert(D3D12_32BIT_INDEX_STRIP_CUT_VALUE == uint32_t(-1), "Mismatch with Direct3D12");
    static_assert(D3D12_32BIT_INDEX_STRIP_CUT_VALUE == UINT32_MAX, "Mismatch with Direct3D12");
#endif

    //---------------------------------------------------------------------------------
    // Utility for walking adjacency
    //---------------------------------------------------------------------------------
    template<class index_t>
    class orbit_iterator
    {
    public:
        enum WalkType
        {
            ALL = 0,
            CW,
            CCW
        };

        orbit_iterator(_In_reads_(nFaces * 3) const uint32_t* adjacency, _In_reads_(nFaces * 3) const index_t* indices, size_t nFaces) noexcept :
            m_face(UNUSED32),
            m_pointIndex(UNUSED32),
            m_currentFace(UNUSED32),
            m_currentEdge(UNUSED32),
            m_nextEdge(UNUSED32),
            m_adjacency(adjacency),
            m_indices(indices),
            m_nFaces(nFaces),
            m_clockWise(false),
            m_stopOnBoundary(false)
        {
        }

        void initialize(uint32_t face, uint32_t point, WalkType wtype) noexcept
        {
            m_face = m_currentFace = face;
            m_pointIndex = point;
            m_clockWise = (wtype != CCW);
            m_stopOnBoundary = (wtype != ALL);

            m_nextEdge = find(face, point);
            assert(m_nextEdge < 3);
            _Analysis_assume_(m_nextEdge < 3);

            if (!m_clockWise)
            {
                m_nextEdge = (m_nextEdge + 2) % 3;
            }

            m_currentEdge = m_nextEdge;
        }

        uint32_t find(uint32_t face, uint32_t point) noexcept
        {
            assert(face < m_nFaces);
            _Analysis_assume_(face < m_nFaces);

            if (m_indices[face * 3] == point)
                return 0;
            else if (m_indices[face * 3 + 1] == point)
                return 1;
            else
            {
                assert(m_indices[face * 3 + 2] == point);
                return 2;
            }
        }

        uint32_t nextFace() noexcept
        {
            assert(!done());

            const uint32_t ret = m_currentFace;
            m_currentEdge = m_nextEdge;

            for (;;)
            {
                const uint32_t prevFace = m_currentFace;

                assert((size_t(m_currentFace) * 3 + m_nextEdge) < (m_nFaces * 3));
                _Analysis_assume_((size_t(m_currentFace) * 3 + m_nextEdge) < (m_nFaces * 3));

                m_currentFace = m_adjacency[m_currentFace * 3 + m_nextEdge];

                if (m_currentFace == m_face)
                {
                    // wrapped around after a full orbit, so finished
                    m_currentFace = UNUSED32;
                    break;
                }
                else if (m_currentFace != UNUSED32)
                {
                    assert((size_t(m_currentFace) * 3 + 2) < (m_nFaces * 3));
                    _Analysis_assume_((size_t(m_currentFace) * 3 + 2) < (m_nFaces * 3));

                    if (m_adjacency[m_currentFace * 3] == prevFace)
                        m_nextEdge = 0;
                    else if (m_adjacency[m_currentFace * 3 + 1] == prevFace)
                        m_nextEdge = 1;
                    else
                    {
                        assert(m_adjacency[m_currentFace * 3 + 2] == prevFace);
                        m_nextEdge = 2;
                    }

                    if (m_clockWise)
                    {
                        m_nextEdge = (m_nextEdge + 1) % 3;
                    }
                    else
                    {
                        m_nextEdge = (m_nextEdge + 2) % 3;
                    }

                    break;
                }
                else if (m_clockWise && !m_stopOnBoundary)
                {
                    // hit boundary and need to restart to go counter-clockwise
                    m_clockWise = false;
                    m_currentFace = m_face;

                    m_nextEdge = find(m_face, m_pointIndex);
                    assert(m_nextEdge < 3);
                    _Analysis_assume_(m_nextEdge < 3);

                    m_nextEdge = (m_nextEdge + 2) % 3;
                    m_currentEdge = (m_currentEdge + 2) % 3;

                    // Don't break out of loop so we can go the other way
                }
                else
                {
                    // hit boundary and should stop
                    break;
                }
            }

            return ret;
        }

        bool moveToCCW() noexcept
        {
            m_currentFace = m_face;

            m_nextEdge = find(m_currentFace, m_pointIndex);
            const uint32_t initialNextEdge = m_nextEdge;
            assert(m_nextEdge < 3);
            _Analysis_assume_(m_nextEdge < 3);

            m_nextEdge = (m_nextEdge + 2) % 3;

            bool ret = false;

            uint32_t prevFace;
            do
            {
                prevFace = m_currentFace;
                m_currentFace = m_adjacency[m_currentFace * 3 + m_nextEdge];

                if (m_currentFace != UNUSED32)
                {
                    if (m_adjacency[m_currentFace * 3] == prevFace)
                        m_nextEdge = 0;
                    else if (m_adjacency[m_currentFace * 3 + 1] == prevFace)
                        m_nextEdge = 1;
                    else
                    {
                        assert(m_adjacency[m_currentFace * 3 + 2] == prevFace);
                        m_nextEdge = 2;
                    }

                    m_nextEdge = (m_nextEdge + 2) % 3;
                }
            }
            while ((m_currentFace != m_face) && (m_currentFace != UNUSED32));

            if (m_currentFace == UNUSED32)
            {
                m_currentFace = prevFace;
                m_nextEdge = (m_nextEdge + 1) % 3;

                m_pointIndex = m_indices[m_currentFace * 3 + m_nextEdge];

                ret = true;
            }
            else
            {
                m_nextEdge = initialNextEdge;
            }

            m_clockWise = true;
            m_currentEdge = m_nextEdge;
            m_face = m_currentFace;
            return ret;
        }

        bool done() const noexcept { return (m_currentFace == UNUSED32); }
        uint32_t getpoint() const noexcept { return m_clockWise ? m_currentEdge : ((m_currentEdge + 1) % 3); }

    private:
        uint32_t        m_face;
        uint32_t        m_pointIndex;
        uint32_t        m_currentFace;
        uint32_t        m_currentEdge;
        uint32_t        m_nextEdge;

        const uint32_t* m_adjacency;
        const index_t*  m_indices;
        size_t          m_nFaces;

        bool            m_clockWise;
        bool            m_stopOnBoundary;
    };


    //-------------------------------------------------------------------------------------
    template<class index_t>
    inline uint32_t find_edge(_In_reads_(3) const index_t* indices, index_t search) noexcept
    {
        assert(indices != nullptr);

        uint32_t edge = 0;

        for (; edge < 3; ++edge)
        {
            if (indices[edge] == search)
                break;
        }

        return edge;
    }

} // namespace
