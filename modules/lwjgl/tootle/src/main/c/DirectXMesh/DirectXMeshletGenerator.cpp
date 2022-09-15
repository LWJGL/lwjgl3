//-------------------------------------------------------------------------------------
// DirectXMeshletGenerator.cpp
//
// DirectX Mesh Geometry Library - Meshlet Computation
//
// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.
//
// http://go.microsoft.com/fwlink/?LinkID=324981
//-------------------------------------------------------------------------------------

#include "DirectXMeshP.h"

using namespace DirectX;
using namespace DirectX::PackedVector;

static_assert(sizeof(MeshletTriangle) == sizeof(uint32_t), "MeshletTriangle packing is incorrect");

namespace
{
    //---------------------------------------------------------------------------------
    // Helper class which manages a fixed-size array like a vector.
    //---------------------------------------------------------------------------------
    template <typename T, size_t N>
    class StaticVector
    {
    public:
        StaticVector() noexcept
            : m_data{}, m_size(0)
        { }
        ~StaticVector() = default;

        StaticVector(StaticVector&&) = default;
        StaticVector& operator= (StaticVector&&) = default;

        StaticVector(StaticVector const&) = default;
        StaticVector& operator= (StaticVector const&) = default;

        void push_back(const T& value) noexcept
        {
            assert(m_size < N);
            m_data[m_size++] = value;
        }

        void push_back(T&& value) noexcept
        {
            assert(m_size < N);
            m_data[m_size++] = std::move(value);
        }

        template <typename... Args>
        void emplace_back(Args&&... args) noexcept
        {
            assert(m_size < N);
            m_data[m_size++] = T(std::forward<Args>(args)...);
        }

        size_t size() const noexcept { return m_size; }
        bool empty() const noexcept { return m_size == 0; }

        T* data() noexcept { return m_data.data(); }
        const T* data() const noexcept { return m_data.data(); }

        T& operator[](size_t index) noexcept { assert(index < m_size); return m_data[index]; }
        const T& operator[](size_t index) const noexcept { assert(index < m_size); return m_data[index]; }

    private:
        std::array<T, N> m_data;
        size_t           m_size;
    };

    //---------------------------------------------------------------------------------
    // Helper struct which maintains the working state of a new meshlet
    //---------------------------------------------------------------------------------
    template <typename T>
    struct InlineMeshlet
    {
        StaticVector<T, MESHLET_MAXIMUM_SIZE>               UniqueVertexIndices;
        StaticVector<MeshletTriangle, MESHLET_MAXIMUM_SIZE> PrimitiveIndices;
    };

    //---------------------------------------------------------------------------------
    // Computes normal vector from the points of a triangle
    //---------------------------------------------------------------------------------
    inline XMVECTOR XM_CALLCONV ComputeNormal(_In_reads_(3) const XMFLOAT3* tri) noexcept
    {
        const XMVECTOR p0 = XMLoadFloat3(&tri[0]);
        const XMVECTOR p1 = XMLoadFloat3(&tri[1]);
        const XMVECTOR p2 = XMLoadFloat3(&tri[2]);

        const XMVECTOR v01 = XMVectorSubtract(p0, p1);
        const XMVECTOR v02 = XMVectorSubtract(p0, p2);

        return XMVector3Normalize(XMVector3Cross(v01, v02));
    }

    //---------------------------------------------------------------------------------
    // Computes number of triangle vertices already exist in the meshlet
    //---------------------------------------------------------------------------------
    template <typename T>
    uint8_t ComputeReuse(const InlineMeshlet<T>& meshlet, _In_reads_(3) const T* triIndices) noexcept
    {
        uint8_t count = 0;
        for (size_t i = 0; i < meshlet.UniqueVertexIndices.size(); ++i)
        {
            for (size_t j = 0; j < 3u; ++j)
            {
                if (meshlet.UniqueVertexIndices[i] == triIndices[j])
                {
                    assert(count < 255);
                    _Analysis_assume_(count < 255);
                    ++count;
                }
            }
        }

        return count;
    }

    //---------------------------------------------------------------------------------
    // Computes a candidacy score based on spatial locality, orientational coherence,
    // and vertex re-use within a meshlet.
    //---------------------------------------------------------------------------------
    template <typename T>
    float XM_CALLCONV ComputeScore(
        const InlineMeshlet<T>& meshlet,
        FXMVECTOR sphere,
        FXMVECTOR normal,
        _In_reads_(3) const T* triIndices,
        _In_reads_(3) const XMFLOAT3* triVerts) noexcept
    {
        // Configurable weighted sum parameters
        constexpr float c_wtReuse = 0.334f;
        constexpr float c_wtLocation = 0.333f;
        constexpr float c_wtOrientation = 1.0f - (c_wtReuse + c_wtLocation);

        // Vertex reuse -
        const uint8_t reuse = ComputeReuse(meshlet, triIndices);
        const float scrReuse = 1.0f - (float(reuse) / 3.0f);

        // Distance from center point - log falloff to preserve normalization where it needs it
        float maxSq = 0;
        for (size_t i = 0; i < 3u; ++i)
        {
            const XMVECTOR pos = XMLoadFloat3(&triVerts[i]);
            const XMVECTOR v = XMVectorSubtract(sphere, pos);

            const float distSq = XMVectorGetX(XMVector3Dot(v, v));
            maxSq = std::max(maxSq, distSq);
        }

        const float r = XMVectorGetW(sphere);
        const float r2 = r * r;
        const float scrLocation = std::max(0.0f, log2f(maxSq / (r2 + FLT_EPSILON) + FLT_EPSILON));

        // Angle between normal and meshlet cone axis - cosine falloff
        const XMVECTOR n = ComputeNormal(triVerts);
        const float d = XMVectorGetX(XMVector3Dot(n, normal));
        const float scrOrientation = (1.0f - d) * 0.5f;

        // Weighted sum of scores
        return c_wtReuse * scrReuse + c_wtLocation * scrLocation + c_wtOrientation * scrOrientation;
    }

    //---------------------------------------------------------------------------------
    // Attempts to add a candidate triangle to a meshlet
    //---------------------------------------------------------------------------------
    template <typename T>
    bool TryAddToMeshlet(
        size_t maxVerts,
        size_t maxPrims,
        _In_reads_(3) const T* tri,
        InlineMeshlet<T>& meshlet)
    {
        // Cull degenerate triangle and return success
        // newCount calculation will break if such triangle is passed
        if (tri[0] == tri[1] || tri[1] == tri[2] || tri[0] == tri[2])
            return true;

        // Are we already full of vertices?
        if (meshlet.UniqueVertexIndices.size() >= maxVerts)
            return false;

        // Are we full, or can we store an additional primitive?
        if (meshlet.PrimitiveIndices.size() >= maxPrims)
            return false;

        uint32_t indices[3] = { uint32_t(-1), uint32_t(-1), uint32_t(-1) };
        uint8_t newCount = 3;

        for (size_t i = 0; i < meshlet.UniqueVertexIndices.size(); ++i)
        {
            for (size_t j = 0; j < 3; ++j)
            {
                if (meshlet.UniqueVertexIndices[i] == tri[j])
                {
                    indices[j] = static_cast<uint32_t>(i);
                    --newCount;
                }
            }
        }

        // Will this triangle fit?
        if (meshlet.UniqueVertexIndices.size() + newCount > maxVerts)
            return false;

        // Add unique vertex indices to unique vertex index list
        for (size_t j = 0; j < 3; ++j)
        {
            if (indices[j] == uint32_t(-1))
            {
                indices[j] = static_cast<uint32_t>(meshlet.UniqueVertexIndices.size());
                meshlet.UniqueVertexIndices.push_back(tri[j]);
            }
        }

        // Add the new primitive
        MeshletTriangle mtri = { indices[0], indices[1], indices[2] };
        meshlet.PrimitiveIndices.emplace_back(mtri);

        return true;
    }

    //---------------------------------------------------------------------------------
    // Determines whether a meshlet contains the maximum number of vertices/primitives
    //---------------------------------------------------------------------------------
    template <typename T>
    inline bool IsMeshletFull(size_t maxVerts, size_t maxPrims, const InlineMeshlet<T>& meshlet) noexcept
    {
        assert(meshlet.UniqueVertexIndices.size() <= maxVerts);
        assert(meshlet.PrimitiveIndices.size() <= maxPrims);

        return meshlet.UniqueVertexIndices.size() >= maxVerts || meshlet.PrimitiveIndices.size() >= maxPrims;
    }

    //---------------------------------------------------------------------------------
    // Meshletize a contiguous list of primitives
    //---------------------------------------------------------------------------------
    template <typename T>
    HRESULT Meshletize(
        size_t maxVerts,
        size_t maxPrims,
        _In_reads_(nFaces * 3) const T* indices,
        size_t nFaces,
        _In_reads_(nVerts) const XMFLOAT3* positions,
        size_t nVerts,
        const std::pair<size_t, size_t>& subset,
        _In_reads_(nFaces * 3) const uint32_t* adjacency,
        std::vector<InlineMeshlet<T>>& meshlets)
    {
        if (!indices || !positions || !adjacency)
            return E_INVALIDARG;

        if (subset.first + subset.second > nFaces)
            return E_UNEXPECTED;

        meshlets.clear();

        // Bitmask of all triangles in mesh to determine whether a specific one has been added
        std::vector<bool> checklist;
        checklist.resize(subset.second);

        // Cache to maintain scores for each candidate triangle
        std::vector<std::pair<uint32_t, float>> candidates;
        std::unordered_set<uint32_t> candidateCheck;

        // Positions and normals of the current primitive
        std::vector<XMFLOAT3> vertices;
        std::vector<XMFLOAT3> normals;

        // Seed the candidate list with the first triangle of the subset
        const uint32_t startIndex = static_cast<uint32_t>(subset.first);
        const uint32_t endIndex = static_cast<uint32_t>(subset.first + subset.second);

        uint32_t triIndex = static_cast<uint32_t>(subset.first);

        candidates.push_back(std::make_pair(triIndex, 0.0f));
        candidateCheck.insert(triIndex);

        // Continue adding triangles until triangle list is exhausted.
        InlineMeshlet<T>* curr = nullptr;

        while (!candidates.empty())
        {
            uint32_t index = candidates.back().first;
            candidates.pop_back();

            T tri[3] =
            {
                indices[index * 3],
                indices[index * 3 + 1],
                indices[index * 3 + 2],
            };

            if (tri[0] >= nVerts ||
                tri[1] >= nVerts ||
                tri[2] >= nVerts)
            {
                return E_UNEXPECTED;
            }

            // Create a new meshlet if necessary
            if (curr == nullptr)
            {
                vertices.clear();
                normals.clear();

                meshlets.emplace_back();
                curr = &meshlets.back();
            }

            // Try to add triangle to meshlet
            if (TryAddToMeshlet(maxVerts, maxPrims, tri, *curr))
            {
                // Success! Mark as added.
                checklist[index - startIndex] = true;

                // Add positions & normal to list
                const XMFLOAT3 points[3] =
                {
                    positions[tri[0]],
                    positions[tri[1]],
                    positions[tri[2]],
                };

                vertices.push_back(points[0]);
                vertices.push_back(points[1]);
                vertices.push_back(points[2]);

                normals.emplace_back();
                XMStoreFloat3(&normals.back(), ComputeNormal(points));

                // Compute new bounding sphere & normal axis
                BoundingSphere positionBounds, normalBounds;
                BoundingSphere::CreateFromPoints(positionBounds, vertices.size(), vertices.data(), sizeof(XMFLOAT3));
                BoundingSphere::CreateFromPoints(normalBounds, normals.size(), normals.data(), sizeof(XMFLOAT3));

                const XMVECTOR psphere = XMLoadFloat4(reinterpret_cast<XMFLOAT4*>(&positionBounds));
                const XMVECTOR normal = XMVector3Normalize(XMLoadFloat4(reinterpret_cast<XMFLOAT4*>(&normalBounds)));

                // Find and add all applicable adjacent triangles to candidate list
                const uint32_t adjIndex = index * 3;

                uint32_t adj[3] =
                {
                    adjacency[adjIndex],
                    adjacency[adjIndex + 1],
                    adjacency[adjIndex + 2],
                };

                for (size_t i = 0; i < 3u; ++i)
                {
                    // Invalid triangle in adjacency slot
                    if (adj[i] == uint32_t(-1))
                        continue;

                    // Primitive is outside the subset
                    if (adj[i] < subset.first || adj[i] > endIndex)
                        continue;

                    // Already processed triangle
                    if (checklist[adj[i] - startIndex])
                        continue;

                    // Triangle already in the candidate list
                    if (candidateCheck.count(adj[i]))
                        continue;

                    candidates.push_back(std::make_pair(adj[i], FLT_MAX));
                    candidateCheck.insert(adj[i]);
                }

                // Re-score remaining candidate triangles
                for (size_t i = 0; i < candidates.size(); ++i)
                {
                    uint32_t candidate = candidates[i].first;

                    T triIndices[3] =
                    {
                        indices[candidate * 3],
                        indices[candidate * 3 + 1],
                        indices[candidate * 3 + 2],
                    };

                    if (triIndices[0] >= nVerts ||
                        triIndices[1] >= nVerts ||
                        triIndices[2] >= nVerts)
                    {
                        return E_UNEXPECTED;
                    }

                    const XMFLOAT3 triVerts[3] =
                    {
                        positions[triIndices[0]],
                        positions[triIndices[1]],
                        positions[triIndices[2]],
                    };

                    candidates[i].second = ComputeScore(*curr, psphere, normal, triIndices, triVerts);
                }

                // Determine whether we need to move to the next meshlet.
                if (IsMeshletFull(maxVerts, maxPrims, *curr))
                {
                    candidateCheck.clear();
                    curr = nullptr;

                    // Discard candidates -  one of our existing candidates as the next meshlet seed.
                    if (!candidates.empty())
                    {
                        candidates[0] = candidates.back();
                        candidates.resize(1);
                        candidateCheck.insert(candidates[0].first);
                    }
                }
                else
                {
                    // Sort in reverse order to use vector as a queue with pop_back
                    std::stable_sort(candidates.begin(), candidates.end(), [](auto& a, auto& b) { return a.second > b.second; });
                }
            }
            else
            {
                // Ran out of candidates while attempting to fill the last bits of a meshlet.
                if (candidates.empty())
                {
                    candidateCheck.clear();
                    curr = nullptr;

                }
            }

            // Ran out of candidates; add a new seed candidate to start the next meshlet.
            if (candidates.empty())
            {
                while (triIndex < endIndex && checklist[triIndex - startIndex])
                    ++triIndex;

                if (triIndex == endIndex)
                    break;

                candidates.push_back(std::make_pair(triIndex, 0.0f));
                candidateCheck.insert(triIndex);
            }
        }

        return S_OK;
    }

    //---------------------------------------------------------------------------------
    // Builds meshlets for a list of index subsets and organizes their data into
    // corresponding output buffers.
    //---------------------------------------------------------------------------------
    template <typename T>
    HRESULT ComputeMeshletsInternal(
        _In_reads_(nFaces * 3) const T* indices,
        size_t nFaces,
        _In_reads_(nVerts) const XMFLOAT3* positions,
        size_t nVerts,
        _In_reads_(nSubsets) const std::pair<size_t, size_t>* subsets,
        size_t nSubsets,
        _In_reads_opt_(nFaces * 3) const uint32_t* adjacency,
        std::vector<Meshlet>& meshlets,
        std::vector<uint8_t>& uniqueVertexIB,
        std::vector<MeshletTriangle>& primitiveIndices,
        _Out_writes_(nSubsets) std::pair<size_t, size_t>* meshletSubsets,
        size_t maxVerts,
        size_t maxPrims)
    {
        if (!indices || !positions || !subsets || !meshletSubsets)
            return E_INVALIDARG;

        // Validate the meshlet vertex & primitive sizes
        if (maxVerts < MESHLET_MINIMUM_SIZE || maxVerts > MESHLET_MAXIMUM_SIZE)
            return E_INVALIDARG;

        if (maxPrims < MESHLET_MINIMUM_SIZE || maxPrims > MESHLET_MAXIMUM_SIZE)
            return E_INVALIDARG;

        if (nFaces == 0 || nVerts == 0 || nSubsets == 0)
            return E_INVALIDARG;

        // Auto-generate adjacency data if not provided.
        std::unique_ptr<uint32_t[]> generatedAdj;
        if (!adjacency)
        {
            generatedAdj.reset(new (std::nothrow) uint32_t[nFaces * 3]);
            if (!generatedAdj)
                return E_OUTOFMEMORY;

            HRESULT hr = GenerateAdjacencyAndPointReps(indices, nFaces, positions, nVerts, 0.0f, nullptr, generatedAdj.get());
            if (FAILED(hr))
            {
                return hr;
            }

            adjacency = generatedAdj.get();
        }

        // Now start generating meshlets
        for (size_t i = 0; i < nSubsets; ++i)
        {
            auto& s = subsets[i];

            if ((s.first + s.second) > nFaces)
            {
                return E_UNEXPECTED;
            }

            std::vector<InlineMeshlet<T>> newMeshlets;
            HRESULT hr = Meshletize(maxVerts, maxPrims, indices, nFaces, positions, nVerts, s, adjacency, newMeshlets);
            if (FAILED(hr))
            {
                return hr;
            }

            meshletSubsets[i] = std::make_pair(meshlets.size(), newMeshlets.size());

            // Determine final unique vertex index and primitive index counts & offsets.
            size_t startVertCount = uniqueVertexIB.size() / sizeof(T);
            size_t startPrimCount = primitiveIndices.size();

            size_t uniqueVertexIndexCount = startVertCount;
            size_t primitiveIndexCount = startPrimCount;

            // Resize the meshlet output array to hold the newly formed meshlets.
            const size_t meshletCount = meshlets.size();
            meshlets.resize(meshletCount + newMeshlets.size());

            Meshlet* dest = &meshlets[meshletCount];
            for (auto& m : newMeshlets)
            {
                dest->VertOffset = static_cast<uint32_t>(uniqueVertexIndexCount);
                dest->VertCount = static_cast<uint32_t>(m.UniqueVertexIndices.size());

                dest->PrimOffset = static_cast<uint32_t>(primitiveIndexCount);
                dest->PrimCount = static_cast<uint32_t>(m.PrimitiveIndices.size());

                uniqueVertexIndexCount += m.UniqueVertexIndices.size();
                primitiveIndexCount += m.PrimitiveIndices.size();

                ++dest;
            }

            // Allocate space for the new data.
            uniqueVertexIB.resize(uniqueVertexIndexCount * sizeof(T));
            primitiveIndices.resize(primitiveIndexCount);

            // Copy data from the freshly built meshlets into the output buffers.
            auto vertDest = reinterpret_cast<T*>(uniqueVertexIB.data()) + startVertCount;
            auto primDest = reinterpret_cast<uint32_t*>(primitiveIndices.data()) + startPrimCount;

            for (auto& m : newMeshlets)
            {
                memcpy(vertDest, m.UniqueVertexIndices.data(), m.UniqueVertexIndices.size() * sizeof(T));
                memcpy(primDest, m.PrimitiveIndices.data(), m.PrimitiveIndices.size() * sizeof(uint32_t));

                vertDest += m.UniqueVertexIndices.size();
                primDest += m.PrimitiveIndices.size();
            }
        }

        return S_OK;
    }


    //---------------------------------------------------------------------------------
    // Generates culling data for a contiguous list of meshlets.
    // Influenced by implementation in https://github.com/zeux/meshoptimizer
    //---------------------------------------------------------------------------------
    template <typename T>
    HRESULT ComputeCullDataInternal(
        _In_reads_(nVerts) const XMFLOAT3* positions,
        size_t nVerts,
        _In_reads_(nMeshlets) const Meshlet* meshlets,
        size_t nMeshlets,
        _In_reads_(nVertIndices) const T* uniqueVertexIndices,
        size_t nVertIndices,
        _In_reads_(nPrimIndices) const MeshletTriangle* primitiveIndices,
        size_t nPrimIndices,
        _Out_writes_(nMeshlets) CullData* cullData,
        MESHLET_FLAGS flags) noexcept
    {
        // Input validation
        if (!positions || !meshlets || !uniqueVertexIndices || !primitiveIndices || !cullData)
            return E_INVALIDARG;

        if (nVerts == 0 || nMeshlets == 0 || nVertIndices == 0 || nPrimIndices == 0)
            return E_INVALIDARG;

        // Cache for meshlet vertices & normals
        XMFLOAT3 vertices[MESHLET_MAXIMUM_SIZE] = {};
        XMFLOAT3 normals[MESHLET_MAXIMUM_SIZE] = {};

        for (size_t mi = 0; mi < nMeshlets; ++mi)
        {
            auto& m = meshlets[mi];
            auto& c = cullData[mi];

            // Cache vertices
            for (size_t i = 0; i < m.VertCount; ++i)
            {
                if (m.VertOffset + i >= nVertIndices)
                {
                    return E_UNEXPECTED;
                }

                const uint32_t vIndex = uniqueVertexIndices[m.VertOffset + i];

                if (vIndex >= nVerts)
                {
                    return E_UNEXPECTED;
                }

                vertices[i] = positions[vIndex];
            }

            // Generate primitive normals & cache
            for (size_t i = 0; i < m.PrimCount; ++i)
            {
                if (m.PrimOffset + i >= nPrimIndices)
                {
                    return E_UNEXPECTED;
                }

                auto primitive = primitiveIndices[m.PrimOffset + i];

                const XMFLOAT3 triangle[3]
                {
                    vertices[primitive.i0],
                    vertices[primitive.i1],
                    vertices[primitive.i2],
                };

                XMVECTOR n = ComputeNormal(triangle);
                n = (flags & MESHLET_WIND_CW) != 0 ? XMVectorNegate(n) : n;

                XMStoreFloat3(&normals[i], n);
            }

            // Calculate spatial bounds
            BoundingSphere::CreateFromPoints(c.BoundingSphere, m.VertCount, vertices, sizeof(XMFLOAT3));
            const XMVECTOR positionBounds = XMLoadFloat4(reinterpret_cast<XMFLOAT4*>(&c.BoundingSphere));

            // Calculate the normal cone
            // 1. Normalized center point of minimum bounding sphere of unit normals == conic axis
            BoundingSphere nsphere;
            BoundingSphere::CreateFromPoints(nsphere, m.PrimCount, normals, sizeof(XMFLOAT3));

            // 2. Calculate dot product of all normals to conic axis, selecting minimum
            const XMVECTOR normalBounds = XMLoadFloat4(reinterpret_cast<XMFLOAT4*>(&nsphere));
            const XMVECTOR axis = XMVectorSetW(XMVector3Normalize(normalBounds), 0);

            XMVECTOR minDot = g_XMOne;
            for (size_t i = 0; i < m.PrimCount; ++i)
            {
                const XMVECTOR dot = XMVector3Dot(axis, XMLoadFloat3(&normals[i]));
                minDot = XMVectorMin(minDot, dot);
            }

            if (XMVector4Less(minDot, XMVectorReplicate(0.1f)))
            {
                XMStoreUByteN4(&c.NormalCone, XMVectorSet(0, 0, 0, 1)); // Degenerate cone
                continue;
            }

            // Find the point on center-t*axis ray that lies in negative half-space of all triangles
            float maxt = 0;

            for (size_t i = 0; i < m.PrimCount; ++i)
            {
                if (m.PrimOffset + i >= nPrimIndices)
                {
                    return E_UNEXPECTED;
                }

                auto const primitive = primitiveIndices[m.PrimOffset + i];

                const XMVECTOR p0 = XMLoadFloat3(&vertices[primitive.i0]);

                const XMVECTOR center = XMVectorSubtract(positionBounds, p0);
                const XMVECTOR normal = XMLoadFloat3(&normals[i]);

                const float dc = XMVectorGetX(XMVector3Dot(center, normal));
                const float dn = XMVectorGetX(XMVector3Dot(axis, normal));

                // dn should be larger than mindp cutoff above
                if (dn <= 0.0f)
                {
                    return E_UNEXPECTED;
                }

                const float t = dc / dn;
                maxt = (t > maxt) ? t : maxt;
            }

            // cone apex should be in the negative half-space of all cluster triangles by construction
            c.ApexOffset = maxt;

            // cos(a) for normal cone is minDot; we need to add 90 degrees on both sides and invert the cone
            // which gives us -cos(a+90) = -(-sin(a)) = sin(a) = sqrt(1 - cos^2(a))
            const XMVECTOR minDotSq = XMVectorMultiply(minDot, minDot);
            XMVECTOR coneCutoff = XMVectorSqrt(XMVectorSubtract(g_XMOne, minDotSq));

            // Quantize normal vector to uint8
            XMBYTEN4 snquant;
            XMStoreByteN4(&snquant, axis);

            c.NormalCone.x = uint8_t(int16_t(snquant.x) + 128);
            c.NormalCone.y = uint8_t(int16_t(snquant.y) + 128);
            c.NormalCone.z = uint8_t(int16_t(snquant.z) + 128);

            // Calculate error bias from quantization
            const XMVECTOR dequant = XMLoadByteN4(&snquant);
            const XMVECTOR error = XMVectorSum(XMVectorAbs(XMVectorSubtract(dequant, axis)));

            // Add error bias to cone cutoff
            coneCutoff = XMVectorAdd(coneCutoff, error);

            // Quantize normal cone spread to uint8 and bias upward
            XMUBYTEN4 nquant;
            XMStoreUByteN4(&nquant, coneCutoff);

            c.NormalCone.w = nquant.x;
        }

        return S_OK;
    }
}


//=====================================================================================
// Entry-points
//=====================================================================================

//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT DirectX::ComputeMeshlets(
    const uint16_t* indices,
    size_t nFaces,
    const XMFLOAT3* positions,
    size_t nVerts,
    const uint32_t* adjacency,
    std::vector<Meshlet>& meshlets,
    std::vector<uint8_t>& uniqueVertexIB,
    std::vector<MeshletTriangle>& primitiveIndices,
    size_t maxVerts,
    size_t maxPrims)
{
    const std::pair<size_t, size_t> s = { 0, nFaces };
    std::pair<size_t, size_t> subset;

    return ComputeMeshletsInternal<uint16_t>(
        indices, nFaces,
        positions, nVerts,
        &s, 1u,
        adjacency,
        meshlets,
        uniqueVertexIB, primitiveIndices,
        &subset,
        maxVerts, maxPrims);
}

_Use_decl_annotations_
HRESULT DirectX::ComputeMeshlets(
    const uint32_t* indices,
    size_t nFaces,
    const XMFLOAT3* positions,
    size_t nVerts,
    const uint32_t* adjacency,
    std::vector<Meshlet>& meshlets,
    std::vector<uint8_t>& uniqueVertexIB,
    std::vector<MeshletTriangle>& primitiveIndices,
    size_t maxVerts,
    size_t maxPrims)
{
    const std::pair<size_t, size_t> s = { 0, nFaces };
    std::pair<size_t, size_t> subset;

    return ComputeMeshletsInternal<uint32_t>(
        indices, nFaces,
        positions, nVerts,
        &s, 1u,
        adjacency,
        meshlets,
        uniqueVertexIB, primitiveIndices,
        &subset,
        maxVerts, maxPrims);
}

_Use_decl_annotations_
HRESULT DirectX::ComputeMeshlets(
    const uint16_t* indices,
    size_t nFaces,
    const XMFLOAT3* positions,
    size_t nVerts,
    const std::pair<size_t, size_t>* subsets,
    size_t nSubsets,
    const uint32_t* adjacency,
    std::vector<Meshlet>& meshlets,
    std::vector<uint8_t>& uniqueVertexIB,
    std::vector<MeshletTriangle>& primitiveIndices,
    std::pair<size_t, size_t>* meshletSubsets,
    size_t maxVerts,
    size_t maxPrims)
{
    return ComputeMeshletsInternal<uint16_t>(
        indices, nFaces,
        positions, nVerts,
        subsets, nSubsets,
        adjacency,
        meshlets,
        uniqueVertexIB, primitiveIndices, meshletSubsets,
        maxVerts, maxPrims);
}

_Use_decl_annotations_
HRESULT DirectX::ComputeMeshlets(
    const uint32_t* indices,
    size_t nFaces,
    const XMFLOAT3* positions,
    size_t nVerts,
    const std::pair<size_t, size_t>* subsets,
    size_t nSubsets,
    const uint32_t* adjacency,
    std::vector<Meshlet>& meshlets,
    std::vector<uint8_t>& uniqueVertexIB,
    std::vector<MeshletTriangle>& primitiveIndices,
    std::pair<size_t, size_t>* meshletSubsets,
    size_t maxVerts,
    size_t maxPrims)
{
    return ComputeMeshletsInternal<uint32_t>(
        indices, nFaces,
        positions, nVerts,
        subsets, nSubsets,
        adjacency,
        meshlets,
        uniqueVertexIB,
        primitiveIndices,
        meshletSubsets,
        maxVerts, maxPrims);
}

_Use_decl_annotations_
HRESULT DirectX::ComputeCullData(
    const XMFLOAT3* positions,
    size_t nVerts,
    const Meshlet* meshlets,
    size_t nMeshlets,
    const uint16_t* uniqueVertexIndices,
    size_t nVertIndices,
    const MeshletTriangle* primitiveIndices,
    size_t nPrimIndices,
    CullData* cullData,
    MESHLET_FLAGS flags) noexcept
{
    return ComputeCullDataInternal<uint16_t>(
        positions, nVerts,
        meshlets, nMeshlets,
        uniqueVertexIndices, nVertIndices,
        primitiveIndices, nPrimIndices,
        cullData, flags);
}

_Use_decl_annotations_
HRESULT DirectX::ComputeCullData(
    const XMFLOAT3* positions,
    size_t nVerts,
    const Meshlet* meshlets,
    size_t nMeshlets,
    const uint32_t* uniqueVertexIndices,
    size_t nVertIndices,
    const MeshletTriangle* primitiveIndices,
    size_t nPrimIndices,
    CullData* cullData,
    MESHLET_FLAGS flags) noexcept
{
    return ComputeCullDataInternal<uint32_t>(
        positions, nVerts,
        meshlets, nMeshlets,
        uniqueVertexIndices, nVertIndices,
        primitiveIndices, nPrimIndices,
        cullData,
        flags);
}
