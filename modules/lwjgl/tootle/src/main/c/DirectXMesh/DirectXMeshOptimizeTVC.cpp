//-------------------------------------------------------------------------------------
// DirectXMeshOptimizeTVC.cpp
//  
// DirectX Mesh Geometry Library - Mesh optimization
//
// Hoppe "Optimization of mesh locality for transparent vertex caching"
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
    //---------------------------------------------------------------------------------
    template<class index_t>
    class mesh_status
    {
    public:
        mesh_status() noexcept :
            mUnprocessed{},
            mFaceOffset(0),
            mFaceCount(0),
            mMaxSubset(0),
            mTotalFaces(0)
        {
        }

        HRESULT initialize(
            _In_reads_(nFaces * 3) const index_t* indices, size_t nFaces,
            _In_reads_(nFaces * 3) const uint32_t* adjacency,
            const std::vector<std::pair<size_t, size_t>>& subsets)
        {
            if (!indices || !nFaces || !adjacency || subsets.empty())
                return E_INVALIDARG;

            // Convert adjacency to 'physical' adjacency
            mPhysicalNeighbors.reset(new (std::nothrow) neighborInfo[nFaces]);
            if (!mPhysicalNeighbors)
                return E_OUTOFMEMORY;

#ifdef _DEBUG
            memset(mPhysicalNeighbors.get(), 0xcd, sizeof(neighborInfo) * nFaces);
#endif

            mFaceOffset = 0;
            mFaceCount = 0;
            mMaxSubset = 0;
            mTotalFaces = nFaces;

            for (auto it = subsets.cbegin(); it != subsets.cend(); ++it)
            {
                if ((uint64_t(it->first) + uint64_t(it->second)) >= UINT32_MAX)
                    return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

                if (it->second > mMaxSubset)
                {
                    mMaxSubset = it->second;
                }

                uint32_t faceOffset = uint32_t(it->first);
                uint32_t faceMax = uint32_t(it->first + it->second);

                for (uint32_t face = faceOffset; face < faceMax; ++face)
                {
                    if (face >= nFaces)
                        return E_UNEXPECTED;

                    index_t i0 = indices[face * 3];
                    index_t i1 = indices[face * 3 + 1];
                    index_t i2 = indices[face * 3 + 2];

                    if (i0 == index_t(-1)
                        || i1 == index_t(-1)
                        || i2 == index_t(-1)
                        || i0 == i1
                        || i0 == i2
                        || i1 == i2)
                    {
                        // unused and degenerate faces should not have neighbors
                        for (uint32_t point = 0; point < 3; ++point)
                        {
                            uint32_t k = adjacency[face * 3 + point];

                            if (k != UNUSED32)
                            {
                                if (k >= nFaces)
                                    return E_UNEXPECTED;

                                if (adjacency[k * 3] == face)
                                    mPhysicalNeighbors[k].neighbors[0] = UNUSED32;

                                if (adjacency[k * 3 + 1] == face)
                                    mPhysicalNeighbors[k].neighbors[1] = UNUSED32;

                                if (adjacency[k * 3 + 2] == face)
                                    mPhysicalNeighbors[k].neighbors[2] = UNUSED32;
                            }

                            mPhysicalNeighbors[face].neighbors[point] = UNUSED32;
                        }
                    }
                    else
                    {
                        for (uint32_t n = 0; n < 3; ++n)
                        {
                            uint32_t neighbor = adjacency[face * 3 + n];

                            if (neighbor != UNUSED32)
                            {
                                if ((neighbor < faceOffset) || (neighbor >= faceMax)
                                    || (neighbor == adjacency[face * 3 + ((n + 1) % 3)])
                                    || (neighbor == adjacency[face * 3 + ((n + 2) % 3)]))
                                {
                                    // Break links for any neighbors outside of our attribute set, and remove duplicate neighbors
                                    neighbor = UNUSED32;
                                }
                                else
                                {
                                    uint32_t edgeBack = find_edge<uint32_t>(&adjacency[neighbor * 3], face);
                                    if (edgeBack < 3)
                                    {
                                        index_t p1 = indices[face * 3 + n];
                                        index_t p2 = indices[face * 3 + ((n + 1) % 3)];

                                        index_t pn1 = indices[neighbor * 3 + edgeBack];
                                        index_t pn2 = indices[neighbor * 3 + ((edgeBack + 1) % 3)];

                                        // if wedge not identical on shared edge, drop link
                                        if ((p1 != pn2) || (p2 != pn1))
                                        {
                                            neighbor = UNUSED32;
                                        }
                                    }
                                    else
                                    {
                                        neighbor = UNUSED32;
                                    }
                                }
                            }

                            mPhysicalNeighbors[face].neighbors[n] = neighbor;
                        }
                    }
                }
            }

            if (!mMaxSubset)
                return E_FAIL;

            mListElements.reset(new (std::nothrow) listElement[mMaxSubset]);
            if (!mListElements)
                return E_OUTOFMEMORY;

            return S_OK;
        }

        HRESULT setSubset(
            _In_reads_(nFaces * 3) const index_t* indices, size_t nFaces,
            size_t faceOffset, size_t faceCount)
        {
            if (!faceCount || !indices || !nFaces)
                return E_INVALIDARG;

            if (faceCount > mMaxSubset)
                return E_UNEXPECTED;

            if (!mListElements)
                return E_POINTER;

            if ((uint64_t(faceOffset) + uint64_t(faceCount)) >= UINT32_MAX)
                return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

            uint32_t faceMax = uint32_t(faceOffset + faceCount);

            if (faceMax > nFaces)
                return E_UNEXPECTED;

            mFaceOffset = faceOffset;
            mFaceCount = faceCount;

            mUnprocessed[0] = UNUSED32;
            mUnprocessed[1] = UNUSED32;
            mUnprocessed[2] = UNUSED32;
            mUnprocessed[3] = UNUSED32;

            for (uint32_t face = uint32_t(faceOffset); face < faceMax; ++face)
            {
                index_t i0 = indices[face * 3];
                index_t i1 = indices[face * 3 + 1];
                index_t i2 = indices[face * 3 + 2];

                if (i0 == index_t(-1)
                    || i1 == index_t(-1)
                    || i2 == index_t(-1))
                {
                    // filter out unused triangles
                    continue;
                }

                uint32_t unprocessed = 0;

                for (uint32_t n = 0; n < 3; ++n)
                {
                    if (mPhysicalNeighbors[face].neighbors[n] != UNUSED32)
                    {
                        unprocessed += 1;

                        assert(mPhysicalNeighbors[face].neighbors[n] >= mFaceOffset);
                        assert(mPhysicalNeighbors[face].neighbors[n] < faceMax);
                    }
                }

                uint32_t faceIndex = uint32_t(face - faceOffset);
                mListElements[faceIndex].processed = false;
                mListElements[faceIndex].unprocessed = unprocessed;

                push_front(faceIndex);
            }

            return S_OK;
        }

        bool isprocessed(uint32_t face) const
        {
            assert(face < mTotalFaces);
            assert((face >= mFaceOffset) || (face < (mFaceOffset + mFaceCount)));
            return mListElements[face - mFaceOffset].processed;
        }

        uint32_t unprocessed_count(uint32_t face) const
        {
            assert(face < mTotalFaces);
            assert((face >= mFaceOffset) || (face < (mFaceOffset + mFaceCount)));
            return mListElements[face - mFaceOffset].unprocessed;
        }

        uint32_t find_initial() const
        {
            for (size_t j = 0; j < 4; ++j)
            {
                if (mUnprocessed[j] != UNUSED32)
                    return uint32_t(mUnprocessed[j] + mFaceOffset);
            }

            return UNUSED32;
        }

        void mark(uint32_t face)
        {
            assert(face < mTotalFaces);
            assert((face >= mFaceOffset) || (face < (mFaceOffset + mFaceCount)));

            uint32_t faceIndex = uint32_t(face - mFaceOffset);

            assert(!mListElements[faceIndex].processed);
            mListElements[faceIndex].processed = true;

            remove(faceIndex);

            for (uint32_t n = 0; n < 3; ++n)
            {
                uint32_t neighbor = mPhysicalNeighbors[face].neighbors[n];
                if ((neighbor != UNUSED32) && !isprocessed(neighbor))
                {
                    decrement(neighbor);
                }
            }
        }

        uint32_t find_next(uint32_t face) const
        {
            assert(face < mTotalFaces);
            assert((face >= mFaceOffset) || (face < (mFaceOffset + mFaceCount)));

            uint32_t iret = 3;
            uint32_t minNeighbor = UNUSED32;
            uint32_t minNextNeighbor = 0;

            for (uint32_t n = 0; n < 3; ++n)
            {
                uint32_t neighbor = mPhysicalNeighbors[face].neighbors[n];

                if ((neighbor == UNUSED32) || isprocessed(neighbor))
                    continue;

                uint32_t unprocessed = unprocessed_count(neighbor);
                assert(unprocessed < 3);

                uint32_t mintemp = UNUSED32;

                for (uint32_t nt = 0; nt < 3; ++nt)
                {
                    uint32_t neighborTemp = mPhysicalNeighbors[neighbor].neighbors[nt];

                    if ((neighborTemp == UNUSED32) || isprocessed(neighborTemp))
                        continue;

                    uint32_t next_count = unprocessed_count(neighborTemp);
                    if (next_count < mintemp)
                        mintemp = next_count;
                }

                if (mintemp == UNUSED32)
                    mintemp = 0;

                if (unprocessed < minNeighbor)
                {
                    iret = n;
                    minNeighbor = unprocessed;
                    minNextNeighbor = mintemp;
                }
                else if ((unprocessed == minNeighbor) && (mintemp < minNextNeighbor))
                {
                    iret = n;
                    minNextNeighbor = mintemp;
                }
            }

            return iret;
        }

        uint32_t get_neighbors(uint32_t face, uint32_t n) const
        {
            assert(face < mTotalFaces);
            assert(n < 3);
            _Analysis_assume_(face < mTotalFaces);
            _Analysis_assume_(n < 3);
            return mPhysicalNeighbors[face].neighbors[n];
        }

        const uint32_t* get_neighborsPtr(uint32_t face) const
        {
            assert(face < mTotalFaces);
            return &mPhysicalNeighbors[face].neighbors[0];
        }

    private:
        void push_front(uint32_t faceIndex)
        {
            assert(faceIndex < mFaceCount);

            uint32_t unprocessed = mListElements[faceIndex].unprocessed;

            uint32_t head = mUnprocessed[unprocessed];
            mListElements[faceIndex].next = head;

            if (head != UNUSED32)
                mListElements[head].prev = faceIndex;

            mUnprocessed[unprocessed] = faceIndex;

            mListElements[faceIndex].prev = UNUSED32;
        }

        void remove(uint32_t faceIndex)
        {
            assert(faceIndex < mFaceCount);

            if (mListElements[faceIndex].prev != UNUSED32)
            {
                assert(mUnprocessed[mListElements[faceIndex].unprocessed] != faceIndex);

                uint32_t prev = mListElements[faceIndex].prev;
                uint32_t next = mListElements[faceIndex].next;

                mListElements[prev].next = next;

                if (next != UNUSED32)
                {
                    mListElements[next].prev = prev;
                }
            }
            else
            {
                // remove head of the list
                assert(mUnprocessed[mListElements[faceIndex].unprocessed] == faceIndex);

                uint32_t unprocessed = mListElements[faceIndex].unprocessed;

                mUnprocessed[unprocessed] = mListElements[faceIndex].next;

                if (mUnprocessed[unprocessed] != UNUSED32)
                {
                    mListElements[mUnprocessed[unprocessed]].prev = UNUSED32;
                }
            }

            mListElements[faceIndex].prev =
                mListElements[faceIndex].next = UNUSED32;
        }

        void decrement(uint32_t face)
        {
            assert(face < mTotalFaces);
            assert((face >= mFaceOffset) || (face < (mFaceOffset + mFaceCount)));
            assert(!isprocessed(face));

            uint32_t faceIndex = uint32_t(face - mFaceOffset);

            assert((mListElements[faceIndex].unprocessed >= 1) && (mListElements[faceIndex].unprocessed <= 3));

            remove(faceIndex);

            mListElements[faceIndex].unprocessed -= 1;

            push_front(faceIndex);
        }

        struct neighborInfo
        {
            uint32_t neighbors[3];
        };

        struct listElement
        {
            bool        processed;
            uint32_t    unprocessed;
            uint32_t    prev;
            uint32_t    next;
        };

        uint32_t                        mUnprocessed[4];
        size_t                          mFaceOffset;
        size_t                          mFaceCount;
        size_t                          mMaxSubset;
        size_t                          mTotalFaces;
        std::unique_ptr<listElement[]>  mListElements;
        std::unique_ptr<neighborInfo[]> mPhysicalNeighbors;
    };


    //---------------------------------------------------------------------------------
    typedef std::pair<uint32_t, uint32_t> facecorner_t;

    template<class index_t>
    inline facecorner_t counterclockwise_corner(facecorner_t corner, mesh_status<index_t>& status)
    {
        assert(corner.second != UNUSED32);
        uint32_t edge = (corner.second + 2) % 3;
        uint32_t neighbor = status.get_neighbors(corner.first, edge);
        uint32_t point = (neighbor == UNUSED32) ? UNUSED32 : find_edge(status.get_neighborsPtr(neighbor), corner.first);
        return facecorner_t(neighbor, point);
    }


    //---------------------------------------------------------------------------------
    class sim_vcache
    {
    public:
        sim_vcache() noexcept : mTail(0), mCacheSize(0) {}

        HRESULT initialize(uint32_t cacheSize)
        {
            if (!cacheSize)
                return E_INVALIDARG;

            mFIFO.reset(new (std::nothrow) uint32_t[cacheSize]);
            if (!mFIFO)
                return E_OUTOFMEMORY;

            mCacheSize = cacheSize;

            clear();

            return S_OK;
        }

        void clear()
        {
            assert(mFIFO != nullptr);
            mTail = 0;
            memset(mFIFO.get(), 0xff, sizeof(uint32_t) * mCacheSize);
        }

        bool access(uint32_t vertex)
        {
            assert(vertex != UNUSED32);
            assert(mFIFO != nullptr);

            for (size_t ptr = 0; ptr < mCacheSize; ++ptr)
            {
                if (mFIFO[ptr] == vertex)
                {
                    return true;
                }
            }

            mFIFO[mTail] = vertex;
            mTail += 1;
            if (mTail == mCacheSize)
                mTail = 0;

            return false;
        }

    private:
        uint32_t                    mTail;
        uint32_t                    mCacheSize;
        std::unique_ptr<uint32_t[]> mFIFO;
    };


    //---------------------------------------------------------------------------------
    template<class index_t>
    HRESULT StripReorderImpl(
        _In_reads_(nFaces * 3) const index_t* indices, _In_ size_t nFaces,
        _In_reads_(nFaces * 3) const uint32_t* adjacency,
        _In_reads_opt_(nFaces) const uint32_t* attributes,
        _Out_writes_(nFaces) uint32_t* faceRemap)
    {
        auto subsets = ComputeSubsets(attributes, nFaces);

        assert(!subsets.empty());

        mesh_status<index_t> status;
        HRESULT hr = status.initialize(indices, nFaces, adjacency, subsets);
        if (FAILED(hr))
            return hr;

        std::unique_ptr<uint32_t[]> faceRemapInverse(new (std::nothrow) uint32_t[nFaces]);
        if (!faceRemapInverse)
            return E_OUTOFMEMORY;

        memset(faceRemapInverse.get(), 0xff, sizeof(uint32_t) * nFaces);

        for (auto it = subsets.cbegin(); it != subsets.cend(); ++it)
        {
            hr = status.setSubset(indices, nFaces, it->first, it->second);
            if (FAILED(hr))
                return hr;

            uint32_t curface = 0;

            for (;;)
            {
                uint32_t face = status.find_initial();
                if (face == UNUSED32)
                    break;

                status.mark(face);

                uint32_t next = status.find_next(face);

                for (;;)
                {
                    assert(face != UNUSED32);
                    faceRemapInverse[face] = uint32_t(curface + it->first);
                    curface += 1;

                    // if at end of strip, break out
                    if (next >= 3)
                        break;

                    face = status.get_neighbors(face, next);
                    assert(face != UNUSED32);

                    status.mark(face);

                    next = status.find_next(face);
                }
            }
        }

        // inverse remap
        memset(faceRemap, 0xff, sizeof(uint32_t) * nFaces);

        for (uint32_t j = 0; j < nFaces; ++j)
        {
            uint32_t f = faceRemapInverse[j];
            if (f < nFaces)
            {
                faceRemap[f] = j;
            }
        }

        return S_OK;
    }


    //---------------------------------------------------------------------------------
    template<class index_t>
    HRESULT VertexCacheStripReorderImpl(
        _In_reads_(nFaces * 3) const index_t* indices, _In_ size_t nFaces,
        _In_reads_(nFaces * 3) const uint32_t* adjacency,
        _In_reads_opt_(nFaces) const uint32_t* attributes,
        _Out_writes_(nFaces) uint32_t* faceRemap,
        uint32_t vertexCache, uint32_t restart)
    {
        auto subsets = ComputeSubsets(attributes, nFaces);

        assert(!subsets.empty());

        mesh_status<index_t> status;
        HRESULT hr = status.initialize(indices, nFaces, adjacency, subsets);
        if (FAILED(hr))
            return hr;

        sim_vcache vcache;
        hr = vcache.initialize(vertexCache);
        if (FAILED(hr))
            return hr;

        std::unique_ptr<uint32_t[]> faceRemapInverse(new (std::nothrow) uint32_t[nFaces]);
        if (!faceRemapInverse)
            return E_OUTOFMEMORY;

        memset(faceRemapInverse.get(), 0xff, sizeof(uint32_t) * nFaces);

        assert(vertexCache >= restart);
        uint32_t desired = vertexCache - restart;

        for (auto it = subsets.cbegin(); it != subsets.cend(); ++it)
        {
            hr = status.setSubset(indices, nFaces, it->first, it->second);
            if (FAILED(hr))
                return hr;

            vcache.clear();

            uint32_t locnext = 0;
            facecorner_t nextCorner(UNUSED32, UNUSED32);
            facecorner_t curCorner(UNUSED32, UNUSED32);

            uint32_t curface = 0;

            for (;;)
            {
                assert(nextCorner.first == UNUSED32);

                curCorner.first = status.find_initial();
                if (curCorner.first == UNUSED32)
                    break;

                uint32_t n0 = status.get_neighbors(curCorner.first, 0);
                if ((n0 != UNUSED32) && !status.isprocessed(n0))
                {
                    curCorner.second = 1;
                }
                else
                {
                    uint32_t n1 = status.get_neighbors(curCorner.first, 1);
                    if ((n1 != UNUSED32) && !status.isprocessed(n1))
                    {
                        curCorner.second = 2;
                    }
                    else
                    {
                        curCorner.second = 0;
                    }
                }

                bool striprestart = false;
                for (;;)
                {
                    assert(curCorner.first != UNUSED32);
                    assert(!status.isprocessed(curCorner.first));

                    // Decision: either add a ring of faces or restart strip
                    if (nextCorner.first != UNUSED32)
                    {
                        uint32_t nf = 0;
                        for (facecorner_t temp = curCorner; ; )
                        {
                            facecorner_t next = counterclockwise_corner<index_t>(temp, status);
                            if ((next.first == UNUSED32) || status.isprocessed(next.first))
                                break;
                            ++nf;
                            temp = next;
                        }

                        if (locnext + nf > desired)
                        {
                            // restart
                            if (!status.isprocessed(nextCorner.first))
                            {
                                curCorner = nextCorner;
                            }

                            nextCorner.first = UNUSED32;
                        }
                    }

                    for (;;)
                    {
                        assert(curCorner.first != UNUSED32);
                        status.mark(curCorner.first);

                        faceRemapInverse[curCorner.first] = uint32_t(curface + it->first);
                        curface += 1;

                        assert(indices[curCorner.first * 3] != index_t(-1));
                        if (!vcache.access(indices[curCorner.first * 3]))
                            locnext += 1;

                        assert(indices[curCorner.first * 3 + 1] != index_t(-1));
                        if (!vcache.access(indices[curCorner.first * 3 + 1]))
                            locnext += 1;

                        assert(indices[curCorner.first * 3 + 2] != index_t(-1));
                        if (!vcache.access(indices[curCorner.first * 3 + 2]))
                            locnext += 1;

                        facecorner_t intCorner = counterclockwise_corner<index_t>(curCorner, status);
                        bool interiornei = (intCorner.first != UNUSED32) && !status.isprocessed(intCorner.first);

                        facecorner_t extCorner = counterclockwise_corner<index_t>(facecorner_t(curCorner.first, (curCorner.second + 2) % 3), status);
                        bool exteriornei = (extCorner.first != UNUSED32) && !status.isprocessed(extCorner.first);

                        if (interiornei)
                        {
                            if (exteriornei)
                            {
                                if (nextCorner.first == UNUSED32)
                                {
                                    nextCorner = extCorner;
                                    locnext = 0;
                                }
                            }
                            curCorner = intCorner;
                        }
                        else if (exteriornei)
                        {
                            curCorner = extCorner;
                            break;
                        }
                        else
                        {
                            curCorner = nextCorner;
                            nextCorner.first = UNUSED32;

                            if ((curCorner.first == UNUSED32) || status.isprocessed(curCorner.first))
                            {
                                striprestart = true;
                                break;
                            }
                        }
                    }

                    if (striprestart)
                        break;
                }
            }
        }

        // inverse remap
        memset(faceRemap, 0xff, sizeof(uint32_t) * nFaces);

        for (uint32_t j = 0; j < nFaces; ++j)
        {
            uint32_t f = faceRemapInverse[j];
            if (f < nFaces)
            {
                faceRemap[f] = j;
            }
        }

        return S_OK;
    }
}

//=====================================================================================
// Entry-points
//=====================================================================================

_Use_decl_annotations_
HRESULT DirectX::OptimizeFaces(
    const uint16_t* indices, size_t nFaces, const uint32_t* adjacency,
    uint32_t* faceRemap, uint32_t vertexCache, uint32_t restart)
{
    if (!indices || !nFaces || !adjacency || !faceRemap)
        return E_INVALIDARG;

    if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
        return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

    if (vertexCache == OPTFACES_V_STRIPORDER)
    {
        return StripReorderImpl<uint16_t>(indices, nFaces, adjacency, nullptr, faceRemap);
    }
    else
    {
        if (restart > vertexCache)
            return E_INVALIDARG;

        return VertexCacheStripReorderImpl<uint16_t>(indices, nFaces, adjacency, nullptr, faceRemap, vertexCache, restart);
    }
}

_Use_decl_annotations_
HRESULT DirectX::OptimizeFaces(
    const uint32_t* indices, size_t nFaces, const uint32_t* adjacency,
    uint32_t* faceRemap, uint32_t vertexCache, uint32_t restart)
{
    if (!indices || !nFaces || !adjacency || !faceRemap)
        return E_INVALIDARG;

    if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
        return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

    if (vertexCache == OPTFACES_V_STRIPORDER)
    {
        return StripReorderImpl<uint32_t>(indices, nFaces, adjacency, nullptr, faceRemap);
    }
    else
    {
        if (restart > vertexCache)
            return E_INVALIDARG;

        return VertexCacheStripReorderImpl<uint32_t>(indices, nFaces, adjacency, nullptr, faceRemap, vertexCache, restart);
    }
}


//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT DirectX::OptimizeFacesEx(
    const uint16_t* indices, size_t nFaces, const uint32_t* adjacency, const uint32_t* attributes,
    uint32_t* faceRemap, uint32_t vertexCache, uint32_t restart)
{
    if (!indices || !nFaces || !adjacency || !attributes || !faceRemap)
        return E_INVALIDARG;

    if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
        return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

    if (vertexCache == OPTFACES_V_STRIPORDER)
    {
        return StripReorderImpl<uint16_t>(indices, nFaces, adjacency, attributes, faceRemap);
    }
    else
    {
        if (restart > vertexCache)
            return E_INVALIDARG;

        return VertexCacheStripReorderImpl<uint16_t>(indices, nFaces, adjacency, attributes, faceRemap, vertexCache, restart);
    }
}

_Use_decl_annotations_
HRESULT DirectX::OptimizeFacesEx(
    const uint32_t* indices, size_t nFaces, const uint32_t* adjacency, const uint32_t* attributes,
    uint32_t* faceRemap, uint32_t vertexCache, uint32_t restart)
{
    if (!indices || !nFaces || !adjacency || !attributes || !faceRemap)
        return E_INVALIDARG;

    if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
        return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

    if (vertexCache == OPTFACES_V_STRIPORDER)
    {
        return StripReorderImpl<uint32_t>(indices, nFaces, adjacency, attributes, faceRemap);
    }
    else
    {
        if (restart > vertexCache)
            return E_INVALIDARG;

        return VertexCacheStripReorderImpl<uint32_t>(indices, nFaces, adjacency, attributes, faceRemap, vertexCache, restart);
    }
}
