/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef _TOOTLE_STRIPIFIER_H_
#define _TOOTLE_STRIPIFIER_H_


#include <cstddef>
#include <list>
#include <vector>

#include <assert.h>

//#define _TIMING

#ifdef _TIMING
    #include <Windows.h>
    #define GetTime() GetTickCount()
    typedef DWORD _TIME;
#endif

class Face;

typedef unsigned int UINT;
typedef std::list<Face*> FaceRefList;
typedef std::list<Face>  FaceList;
typedef std::vector<Face*> FaceStrip;
typedef std::vector<FaceStrip> FaceStrips;

typedef std::vector<UINT> VertList;

//=========================================================================================================
/// \ingroup Face
/// \brief Holds vertices, pointers to neighbors, and accessor functions for the face of a mesh
///
//=========================================================================================================
class Face
{
public:
    //===================================================================//
    /// \brief Destructor
    //===================================================================//
    ~Face() {}

    //===================================================================//
    /// \brief returns the index to the first vertex
    //===================================================================//
    UINT First(void) const { return m_vertexIndices[0]; }

    //===================================================================//
    /// \brief returns the index to the second vertex
    //===================================================================//
    UINT Second(void) const { return m_vertexIndices[1]; }

    //===================================================================//
    /// \brief returns the index to the third vertex
    //===================================================================//
    UINT Third(void) const { return m_vertexIndices[2]; }

    //===================================================================//
    /// \brief returns the index to the specifed vertex of the face
    //===================================================================//
    UINT VertexByIndex(UINT uiIndex) const { return m_vertexIndices[uiIndex]; }

    //===================================================================//
    /// \brief retuns the number of neighbors the face has
    //===================================================================//
    UINT Degree(void) const { return m_uDegree; }

    //===================================================================//
    /// \brief returns a pointer to the array of neighbors
    //===================================================================//
    Face** GetNeighbors(void) { return m_neighbors; }

    //===================================================================//
    /// \brief returns whether or not the face was processed
    //===================================================================//
    bool WasProcessed(void) { return m_bProcessed; }

    //===================================================================//
    /// \brief Sets the face as being processed
    //===================================================================//
    void Processed(void) { m_bProcessed = true; }

    //===================================================================//
    /// \brief adds the specified face as a neighbor to the specified side
    //===================================================================//
    UINT AddNeighbor(Face* pFace, UINT uSide);

    //===================================================================//
    /// \brief removes the specified neighbor
    //===================================================================//
    UINT RemoveNeighbor(Face* pNeighbor);

    //===================================================================//
    /// \brief removes the neighbor on the specified side
    //===================================================================//
    UINT RemoveNeighbor(UINT uSide);

    //===================================================================//
    /// \brief returns the edge to the right of specified neighbor
    //===================================================================//
    UINT GetRightEdge(Face* pNeighbor);

    //===================================================================//
    /// \brief returns the edge to the left of specified neighbor
    //===================================================================//
    UINT GetLeftEdge(Face* pNeighbor);

    //===================================================================//
    /// \brief returns the edge associated with the specified neighbor
    //===================================================================//
    UINT GetEdge(Face* pNeighbor);

    //===================================================================//
    /// \brief Set the ID of the face.
    //===================================================================//
    void SetID(UINT nID) { m_nID = nID; }

    //===================================================================//
    /// \brief returns the ID of the face.
    //===================================================================//
    UINT GetID(void) { return m_nID; }

private:
    friend class FaceManager;
    //===================================================================//
    /// \brief Constructor
    //===================================================================//
    Face(UINT uVertexIndex1, UINT uVertexIndex2, UINT uVertexIndex3);

    /// stores the indices to the three vertex indices
    UINT m_vertexIndices[3];

    /// stores pointers to the neighboring faces. The index indicates which side the neighbor is on
    Face* m_neighbors[3];

    /// The number of neighbors
    UINT m_uDegree;

    // the index of this face in the original array (used for m_faceRemap's computation).
    UINT m_nID;

    /// Indicates whether the face has been processed
    bool m_bProcessed;
};

//=========================================================================================================
/// \ingroup
/// \brief
///
//=========================================================================================================
class FaceManager
{
public:

    //===================================================================//
    /// \brief Constructor and Destructor
    //===================================================================//
    FaceManager(void);
    virtual ~FaceManager(void);

    //===================================================================//
    /// \brief Makes a Face from the specified vertex indices
    //===================================================================//
    bool MakeFace(UINT uVertexIndex1, UINT uVertexIntex2, UINT uVertexIndex3, UINT nID);

    //===================================================================//
    /// \brief Generates efficient lists from the created faces
    //===================================================================//
    bool Stripify(void);

    //===================================================================//
    /// \brief returns a VertList containing the efficient index buffer
    //===================================================================//
    VertList GetStrippedList(void) { return m_vertList; }

    //===================================================================//
    /// \brief returns a vector containing the face remapping.
    //===================================================================//
    std::vector<UINT> GetFaceRemap(void) { return m_faceRemap; }

    //===================================================================//
    /// \brief reserve nFaces space for the m_faceRemap vector.
    //===================================================================//
    void ResizeFaceRemap(UINT nFaces);
#ifdef _TIMING
    _TIME m_tMakeNeighbors; /// Time spent in the call to MakeFace
    _TIME m_tAdjLoop;       /// Time spent in the loop calculating face adjacency (expensive)
    _TIME m_tAdjacency;     /// Time spent in the call to GetFaceAdjacency
    _TIME m_tPush;          /// Time spent pushing new faces onto m_faces
    _TIME m_tStripify;      /// Time spent stripifying the faces
    _TIME m_tSortBins;      /// Time spent initially sorting m_faces into m_degreeBins
    _TIME m_tDropNeighbors; /// Time spent removing neighbors from eachother and changing bins (expensive)
    _TIME m_tAddFaces;      /// Time spent adding faces to the final strip
#endif
private:

    /// lists of faces with a specified number of neighbors
    FaceRefList m_degreeBins[4]; // 0, 1, 2, or 3 neighbors

    /// list of all the faces created by the face manager
    FaceRefList m_faces;

    /// list containing the efficiently ordered vertex indices
    VertList m_vertList;

    // a list containing the face remapping.
    // Entry i will contain the new position of face i in the reordered indices.
    UINT m_nFaceRemapCount;                 // used to create ID for adding face into the strips
    std::vector<UINT> m_faceRemap;

    //===================================================================//
    /// \brief returns the edge index that is shared by the two faces;
    //===================================================================//
    int GetFaceAdjacency(const Face& cFace1, const Face& cFace2);

    //===================================================================//
    /// \brief Adds the face to the specified list and to the efficient list
    //===================================================================//
    bool AddFaceToStrip(Face* pNewFace, FaceStrip& rList, UINT uDirection, UINT uEdge);

    //===================================================================//
    /// \brief removes rFace from each of its neighbors
    //===================================================================//
    bool DropNeighbors(Face& rFace, Face* pExceptNeighbor = NULL);
};

//=========================================================================================================
/// \ingroup
/// \brief
///
//=========================================================================================================
class Stripifier
{
public:
    //===================================================================//
    /// \brief Generates an efficient vertex index buffer from the input vertex indices
    //===================================================================//
    static void Process(const unsigned int* pVertexIndicesIN,
                        const unsigned int uiTriangleCount,
                        unsigned int* pVertexIndicesOUT,
                        unsigned int* pnFaceRemapOut);
};

#endif // _TOOTLE_STRIPIFIER_H_
