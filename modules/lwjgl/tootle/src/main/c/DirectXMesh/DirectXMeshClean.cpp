//-------------------------------------------------------------------------------------
// DirectXMeshClean.cpp
//  
// DirectX Mesh Geometry Library - Mesh clean-up
//
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// http://go.microsoft.com/fwlink/?LinkID=324981
//-------------------------------------------------------------------------------------

#include "DirectXMeshP.h"

using namespace DirectX;

namespace
{
    template<class index_t>
    HRESULT CleanImpl(
        _Inout_updates_all_(nFaces * 3) index_t* indices,
        size_t nFaces, size_t nVerts,
        _Inout_updates_all_opt_(nFaces * 3) uint32_t* adjacency,
        _In_reads_opt_(nFaces) const uint32_t* attributes,
        _Inout_ std::vector<uint32_t>& dupVerts, bool breakBowties)
    {
        if (!adjacency && !attributes)
            return E_INVALIDARG;

        if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
            return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

        dupVerts.clear();
        size_t curNewVert = nVerts;

        size_t tsize = (sizeof(bool) * nFaces * 3) + (sizeof(uint32_t) * nVerts) + (sizeof(index_t) * nFaces * 3);
        std::unique_ptr<uint8_t[]> temp(new (std::nothrow) uint8_t[tsize]);
        if (!temp)
            return E_OUTOFMEMORY;

        auto faceSeen = reinterpret_cast<bool*>(temp.get());
        auto ids = reinterpret_cast<uint32_t*>(temp.get() + sizeof(bool) * nFaces * 3);

        // UNUSED/DEGENERATE cleanup
        for (uint32_t face = 0; face < nFaces; ++face)
        {
            index_t i0 = indices[face * 3];
            index_t i1 = indices[face * 3 + 1];
            index_t i2 = indices[face * 3 + 2];

            if (i0 == index_t(-1)
                || i1 == index_t(-1)
                || i2 == index_t(-1))
            {
                // ensure all index entries in the unused face are 'unused'
                indices[face * 3] =
                    indices[face * 3 + 1] =
                    indices[face * 3 + 2] = index_t(-1);

                // ensure no neighbor references the unused face
                if (adjacency)
                {
                    for (uint32_t point = 0; point < 3; ++point)
                    {
                        uint32_t k = adjacency[face * 3 + point];
                        if (k != UNUSED32)
                        {
                            assert(k < nFaces);
                            _Analysis_assume_(k < nFaces);

                            if (adjacency[k * 3] == face)
                                adjacency[k * 3] = UNUSED32;

                            if (adjacency[k * 3 + 1] == face)
                                adjacency[k * 3 + 1] = UNUSED32;

                            if (adjacency[k * 3 + 2] == face)
                                adjacency[k * 3 + 2] = UNUSED32;

                            adjacency[face * 3 + point] = UNUSED32;
                        }
                    }
                }
            }
            else if (i0 == i1
                || i0 == i2
                || i1 == i2)
            {
                // Clean doesn't trim out degenerates as most other functions ignore them

                // ensure no neighbor references the degenerate face
                if (adjacency)
                {
                    for (uint32_t point = 0; point < 3; ++point)
                    {
                        uint32_t k = adjacency[face * 3 + point];
                        if (k != UNUSED32)
                        {
                            assert(k < nFaces);
                            _Analysis_assume_(k < nFaces);

                            if (adjacency[k * 3] == face)
                                adjacency[k * 3] = UNUSED32;

                            if (adjacency[k * 3 + 1] == face)
                                adjacency[k * 3 + 1] = UNUSED32;

                            if (adjacency[k * 3 + 2] == face)
                                adjacency[k * 3 + 2] = UNUSED32;

                            adjacency[face * 3 + point] = UNUSED32;
                        }
                    }
                }
            }
        }

        // ASYMMETRIC ADJ cleanup
        if (adjacency)
        {
            for (;;)
            {
                bool unlinked = false;

                for (uint32_t face = 0; face < nFaces; ++face)
                {
                    for (uint32_t point = 0; point < 3; ++point)
                    {
                        uint32_t k = adjacency[face * 3 + point];
                        if (k != UNUSED32)
                        {
                            assert(k < nFaces);
                            _Analysis_assume_(k < nFaces);

                            uint32_t edge = find_edge<uint32_t>(&adjacency[k * 3], face);
                            if (edge >= 3)
                            {
                                unlinked = true;
                                adjacency[face * 3 + point] = UNUSED32;
                            }
                        }
                    }
                }

                if (!unlinked)
                    break;
            }
        }

        // BACKFACING cleanup
        if (adjacency)
        {
            for (size_t face = 0; face < nFaces; ++face)
            {
                index_t i0 = indices[face * 3];
                index_t i1 = indices[face * 3 + 1];
                index_t i2 = indices[face * 3 + 2];

                if (i0 == index_t(-1)
                    || i1 == index_t(-1)
                    || i2 == index_t(-1))
                {
                    // ignore unused faces
                    continue;
                }

                assert(i0 < nVerts);
                assert(i1 < nVerts);
                assert(i2 < nVerts);

                if (i0 == i1
                    || i0 == i2
                    || i1 == i2)
                {
                    // ignore degenerate faces
                    continue;
                }

                uint32_t j0 = adjacency[face * 3];
                uint32_t j1 = adjacency[face * 3 + 1];
                uint32_t j2 = adjacency[face * 3 + 2];

                if ((j0 == j1 && j0 != UNUSED32)
                    || (j0 == j2 && j0 != UNUSED32)
                    || (j1 == j2 && j1 != UNUSED32))
                {
                    uint32_t neighbor = (j0 == j1 || j0 == j2) ? j0 : j1;

                    // remove links then break bowties will clean up any remaining issues
                    for (uint32_t edge = 0; edge < 3; ++edge)
                    {
                        if (adjacency[face * 3 + edge] == neighbor)
                        {
                            adjacency[face * 3 + edge] = UNUSED32;
                        }

                        if (adjacency[neighbor * 3 + edge] == face)
                        {
                            adjacency[neighbor * 3 + edge] = UNUSED32;
                        }
                    }
                }
            }
        }

        auto indicesNew = reinterpret_cast<index_t*>(reinterpret_cast<uint8_t*>(ids) + sizeof(uint32_t) * nVerts);
        memcpy(indicesNew, indices, sizeof(index_t) * nFaces * 3);

        // BOWTIES cleanup
        if (adjacency && breakBowties)
        {
            memset(faceSeen, 0, sizeof(bool) * nFaces * 3);
            memset(ids, 0xFF, sizeof(uint32_t) * nVerts);

            orbit_iterator<index_t> ovi(adjacency, indices, nFaces);

            for (uint32_t face = 0; face < nFaces; ++face)
            {
                index_t i0 = indices[face * 3];
                index_t i1 = indices[face * 3 + 1];
                index_t i2 = indices[face * 3 + 2];

                if (i0 == index_t(-1)
                    || i1 == index_t(-1)
                    || i2 == index_t(-1))
                {
                    // ignore unused faces
                    faceSeen[face * 3] = true;
                    faceSeen[face * 3 + 1] = true;
                    faceSeen[face * 3 + 2] = true;
                    continue;
                }

                assert(i0 < nVerts);
                assert(i1 < nVerts);
                assert(i2 < nVerts);

                if (i0 == i1
                    || i0 == i2
                    || i1 == i2)
                {
                    // ignore degenerate faces
                    faceSeen[face * 3] = true;
                    faceSeen[face * 3 + 1] = true;
                    faceSeen[face * 3 + 2] = true;
                    continue;
                }

                for (uint32_t point = 0; point < 3; ++point)
                {
                    if (faceSeen[face * 3 + point])
                        continue;

                    faceSeen[face * 3 + point] = true;

                    index_t i = indices[face * 3 + point];
                    if (i == index_t(-1))
                        continue;

                    assert(i < nVerts);

                    ovi.initialize(face, i, orbit_iterator<index_t>::ALL);
                    ovi.moveToCCW();

                    index_t replaceVertex = index_t(-1);
                    index_t replaceValue = index_t(-1);

                    while (!ovi.done())
                    {
                        uint32_t curFace = ovi.nextFace();
                        if (curFace >= nFaces)
                            return E_FAIL;

                        uint32_t curPoint = ovi.getpoint();
                        if (curPoint > 2)
                            return E_FAIL;

                        faceSeen[curFace * 3 + curPoint] = true;

                        index_t j = indices[curFace * 3 + curPoint];
                        if (j == index_t(-1))
                            continue;

                        assert(j < nVerts);

                        if (j == replaceVertex)
                        {
                            indicesNew[curFace * 3 + curPoint] = replaceValue;
                        }
                        else if (ids[j] == UNUSED32)
                        {
                            ids[j] = face;
                        }
                        else if (ids[j] != face)
                        {
                            // We found a bowtie, duplicate a vert
                            replaceVertex = j;
                            replaceValue = index_t(curNewVert);
                            indicesNew[curFace * 3 + curPoint] = replaceValue;
                            ++curNewVert;

                            dupVerts.push_back(j);
                        }
                    }
                }
            }

            assert((nVerts + dupVerts.size()) == curNewVert);
        }

        // Ensure no vertex is used by more than one attribute
        if (attributes)
        {
            memset(ids, 0xFF, sizeof(uint32_t) * nVerts);

            std::vector<uint32_t> dupAttr;
            dupAttr.reserve(dupVerts.size());
            for (size_t j = 0; j < dupVerts.size(); ++j)
            {
                dupAttr.push_back(UNUSED32);
            }

            std::unordered_multimap<uint32_t, size_t> dups;

            for (size_t face = 0; face < nFaces; ++face)
            {
                uint32_t a = attributes[face];

                for (size_t point = 0; point < 3; ++point)
                {
                    uint32_t j = indicesNew[face * 3 + point];

                    uint32_t k = (j >= nVerts) ? dupAttr[j - nVerts] : ids[j];

                    if (k == UNUSED32)
                    {
                        if (j >= nVerts)
                            dupAttr[j - nVerts] = a;
                        else
                            ids[j] = a;
                    }
                    else if (k != a)
                    {
                        // Look for a dup with the correct attribute
                        auto range = dups.equal_range(j);
                        auto it = range.first;
                        for (; it != range.second; ++it)
                        {
                            uint32_t m = (it->second >= nVerts) ? dupAttr[it->second - nVerts] : ids[it->second];
                            if (m == a)
                            {
                                indicesNew[face * 3 + point] = index_t(it->second);
                                break;
                            }
                        }

                        if (it == range.second)
                        {
                            // Duplicate the vert
                            auto dv = std::pair<uint32_t, size_t>(j, curNewVert);
                            dups.insert(dv);

                            indicesNew[face * 3 + point] = index_t(curNewVert);
                            ++curNewVert;

                            if (j >= nVerts)
                            {
                                dupVerts.push_back(dupVerts[j - nVerts]);
                            }
                            else
                            {
                                dupVerts.push_back(j);
                            }

                            dupAttr.push_back(a);

                            assert(dupVerts.size() == dupAttr.size());
                        }
                    }
                }
            }

            assert((nVerts + dupVerts.size()) == curNewVert);

#ifndef NDEBUG
            for (auto it = dupVerts.begin(); it != dupVerts.end(); ++it)
            {
                assert(*it < nVerts);
            }
#endif
        }

        if ((uint64_t(nVerts) + uint64_t(dupVerts.size())) >= index_t(-1))
            return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

        if (!dupVerts.empty())
        {
            memcpy(indices, indicesNew, sizeof(index_t) * nFaces * 3);
        }

        return S_OK;
    }
}

//=====================================================================================
// Entry-points
//=====================================================================================

//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT DirectX::Clean(
    uint16_t* indices, size_t nFaces,
    size_t nVerts,
    uint32_t* adjacency, const uint32_t* attributes,
    std::vector<uint32_t>& dupVerts, bool breakBowties)
{
    HRESULT hr = Validate(indices, nFaces, nVerts, adjacency, VALIDATE_DEFAULT);
    if (FAILED(hr))
        return hr;

    return CleanImpl<uint16_t>(indices, nFaces, nVerts, adjacency, attributes, dupVerts, breakBowties);
}


//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT DirectX::Clean(
    uint32_t* indices, size_t nFaces,
    size_t nVerts,
    uint32_t* adjacency, const uint32_t* attributes,
    std::vector<uint32_t>& dupVerts, bool breakBowties)
{
    HRESULT hr = Validate(indices, nFaces, nVerts, adjacency, VALIDATE_DEFAULT);
    if (FAILED(hr))
        return hr;

    return CleanImpl<uint32_t>(indices, nFaces, nVerts, adjacency, attributes, dupVerts, breakBowties);
}
