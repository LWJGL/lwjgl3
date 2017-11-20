/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#include "TootlePCH.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

#include "heap.h"
#include "feedback.h"
#include "error.h"

// Arc array
typedef struct _ARC
{
    int i, j, c;
} ARC, *PARC;
PARC arc;//renamed to arc, because of function redefinition error. Conflicts with name of function "Arc" in windows.h

// Per-vertex number of arcs
static int* ArcCount;
// Per-vertex section in arc list
static PARC* ArcStart;

// In-cost - Out-cost
static int* DeltaCost;
// Out degree
static int* OutDegree;
// In degree
static int* InDegree;

// Output ordering
static int* Ordered;
static int iFirst, iLast;

// Zero degree
static int* Zero;
static int nZero;

// Heap
p_heap H, *Heap = &H;

#if 0
static int cmp(const void* va, const void* vb)
{
    PARC a = (PARC) va;
    PARC b = (PARC) vb;

    if (a->i < b->i) { return -1; }
    else if (a->i > b->i) { return 1; }
    else if (a->j < b->j) { return -1; }
    else if (a->j > b->j) { return 1; }
    else { return 0; }
}
#endif

static int cmp(const void* va, const void* vb)
{
    PARC a = (PARC) va;
    PARC b = (PARC) vb;

    if (a->i < b->i) { return -1; }
    else if (a->i > b->i) { return 1; }
    else if (a->c * b->c > 0)
    {
        if (a->j < b->j) { return -1; }
        else if (a->j > b->j) { return 1; }
        else { return 0; }
    }
    else if (a->c < b->c) { return -1; }
    else if (a->c > b->c) { return 1; }
    else { return 0; }
}


void Output(int v)
{
    // Kick out of heap
    heap_remove(Heap, v);

    // In cost < Out cost, should go first
    if (DeltaCost[v] < 0)
    {
        Ordered[iFirst++] = v;
        // Out cost < In cost, should go last
    }
    else if (DeltaCost[v] > 0)
    {
        Ordered[iLast--] = v;
        // In cost == Out cost, check degrees
        // If out degree  is higher, should go first
    }
    else if (InDegree[v] < OutDegree[v])
    {
        Ordered[iFirst++] = v;
        // otherwise should go last
    }
    else
    {
        Ordered[iLast--] = v;
    }

    // Update data due to removal of vertex
    PARC pA = ArcStart[v];

    for (int i = 0; i < ArcCount[v]; i++)
    {
        if (heap_position(Heap, pA[i].j) <= 0) { continue; }

        DeltaCost[pA[i].j] -= pA[i].c;
        heap_update(Heap, pA[i].j, -abs(DeltaCost[pA[i].j]));

        // out arc
        if (pA[i].c > 0)
        {
            InDegree[pA[i].j]--;

            if (InDegree[pA[i].j] == 0 && OutDegree[pA[i].j] != 0)
            {
                Zero[nZero++] = pA[i].j;
            }

            // in arc
        }
        else
        {
            OutDegree[pA[i].j]--;

            if (OutDegree[pA[i].j] == 0 && InDegree[pA[i].j] != 0)
            {
                Zero[nZero++] = pA[i].j;
            }
        }
    }
}


// helper macro to to test for out of memory.  This makes the code below a bit more compact
#define CHECK_OUT_OF_MEMORY(p) \
    if( !p ) \
    { \
        return 1; \
    } \


    int feedback(int nVerts, int nArcs, t_edge* graph, int* order)
    {
        arc = (PARC) malloc(sizeof(ARC) * 2 * nArcs) ;
        DeltaCost = (int*) malloc(sizeof(int) * nVerts);
        ArcStart = (PARC*) malloc(sizeof(PARC*) * nVerts);
        Zero = (int*) malloc(sizeof(int) * nVerts);
        Ordered = (int*) malloc(sizeof(int) * nVerts);
        ArcCount = (int*) malloc(sizeof(int) * nVerts);
        OutDegree = (int*) malloc(sizeof(int) * nVerts);
        InDegree = (int*) malloc(sizeof(int) * nVerts);

        CHECK_OUT_OF_MEMORY(arc);
        CHECK_OUT_OF_MEMORY(DeltaCost);
        CHECK_OUT_OF_MEMORY(ArcStart);
        CHECK_OUT_OF_MEMORY(Zero);
        CHECK_OUT_OF_MEMORY(Ordered);
        CHECK_OUT_OF_MEMORY(ArcCount);
        CHECK_OUT_OF_MEMORY(OutDegree);
        CHECK_OUT_OF_MEMORY(InDegree);

        memset(arc, 0, sizeof(int) * 2 * nArcs);
        memset(DeltaCost, 0, sizeof(int) * nVerts);
        memset(ArcCount, 0, sizeof(int) * nVerts);
        memset(OutDegree, 0, sizeof(int) * nVerts);
        memset(InDegree, 0, sizeof(int) * nVerts);

        PARC pArc = arc;

        for (int a = 0; a < nArcs; a++)
        {
            int i, j, c;
            i = graph[a].from;
            j = graph[a].to;
            c = graph[a].cost;
            //printf("edge: %i %i %i\n", i, j, c);
            ArcCount[i]++; ArcCount[j]++;
            DeltaCost[i] -= c; DeltaCost[j] += c;
            InDegree[j]++; OutDegree[i]++;
            pArc->i = i; pArc->j = j; pArc->c = c;
            pArc++;
            pArc->i = j; pArc->j = i; pArc->c = -c;
            pArc++;
        }

        // Make sure edges are sorted by vertex index
        qsort(arc, 2 * nArcs, sizeof(ARC), cmp);

        // Find start of each vertex's section in edge list
        memset(ArcStart, 0, sizeof(PARC*) * nVerts);
        pArc = arc;

        for (int i = 0; i < nVerts; i++)
        {
            if (ArcCount[i] > 0)
            {
                ArcStart[i] = pArc;
                pArc += ArcCount[i];
            }
        }

        // Allocate and initialize heap
        if (!heap_create(Heap, nVerts))
        {
            errorf(("Out of memory."));
            return 1;
        }

        for (int i = 0; i < nVerts; i++)
        {
            heap_insert(Heap, i, -abs(DeltaCost[i]));
        }

        //  initialize stack of zero degree vertices
        nZero = 0;

        for (int i = 0; i < nVerts; i++)
        {
            if (InDegree[i] == 0 || OutDegree[i] == 0)
            {
                Zero[nZero++] = i;
            }
        }

        memset(Ordered, 0, sizeof(int) * nVerts);

        // While there are vertices to be output
        iFirst = 0;
        iLast = nVerts - 1;

        while (1)
        {
            // Output vertices with zero degree
            while (nZero > 0)
            {
                int v = Zero[--nZero];
                Output(v);
            }

            if (iFirst > iLast) { break; }

            Output((int)heap_gettop(Heap, NULL));

            if (iFirst > iLast) { break; }
        }

        // Output results
        //for (i = 0; i < nVerts; i++)
        //    printf("%d\n", Ordered[i]);
        memcpy(order, Ordered, sizeof(int) * nVerts);

        // clean up
        free(arc);
        free(DeltaCost);
        free(ArcCount);
        free(OutDegree);
        free(InDegree);
        free(ArcStart);
        free(Zero);
        free(Ordered);
        heap_destroy(Heap);

        return 1;
    }
