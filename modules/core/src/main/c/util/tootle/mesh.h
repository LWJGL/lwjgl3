/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef MESH_H
#define MESH_H

#include "soup.h"
#include "Timer.h"
#include "error.h"

typedef std::vector< std::vector<UINT> > VTArray;

class Mesh: public Soup
{
public:
    Mesh(void) { ; }
    virtual ~Mesh() { ; }
    int ComputeVT(VTArray& vtOut);
    int ComputeAE(const VTArray& vt);
    int ComputeVV(void);


    // across-edge information
    std::vector<UINT>& ae(int i) { return ae_[i]; }
    const std::vector<UINT>& ae(int i) const { return ae_[i]; }
    std::vector< std::vector<UINT> >& ae(void) { return ae_; }
    const std::vector< std::vector<UINT> >& ae(void) const { return ae_; }

    // neighbor vertex information
    std::vector<UINT>& vv(int i) { return vv_[i]; }
    const std::vector<UINT>& vv(int i) const { return vv_[i]; }
    std::vector< std::vector<UINT> >& vv(void) { return vv_; }
    const std::vector< std::vector<UINT> >& vv(void) const { return vv_; }

protected:
    // across edge info (same as structure as a triangle)
    std::vector< std::vector<UINT> > ae_;
    // vertex neighboring vertices
    std::vector< std::vector<UINT> > vv_;
private:
    // prevent catastrophic copies
    Mesh (const Mesh&);
    Mesh& operator=(const Mesh&);
};

inline int
Mesh::ComputeVV(void)
{
    Timer time;
    debugf(("Finding vertex neighbors"));

    vv ().resize (v ().size ());

    for (int i = 0; i < static_cast<int>(t().size()); i++)
    {
        vv(t(i)[0]).push_back (t(i)[1]);
        vv(t(i)[1]).push_back (t(i)[0]);
        vv(t(i)[1]).push_back (t(i)[2]);
        vv(t(i)[2]).push_back (t(i)[1]);
        vv(t(i)[2]).push_back (t(i)[0]);
        vv(t(i)[0]).push_back (t(i)[2]);
    }

    debugf(("Done in %gs", time.GetElapsed()));
    return 1;
}

inline int
Mesh::ComputeVT(VTArray& vtOut)
{
    Timer time;
    debugf(("Finding vertex faces"));

    // get all faces that use each vertex
    vtOut.resize (v ().size ());

    for (int f = 0; f < static_cast<int>(t().size()); f++)
    {
        Soup::Triangle& face = t(f);

        for (int i = 0; i < 3; i++)
        {
            vtOut[face[i]].push_back (f);
        }
    }

    debugf(("Done in %gs", time.GetElapsed()));
    return 1;
}


inline int
Mesh::ComputeAE(const VTArray& vt)
{
    Timer time;
    debugf(("Finding across edge-info"));
    // clean across-edge info
    ae().resize(t().size());

    // find across-edge info
    for (int f = 0; f < static_cast<int>(t().size()); f++)
    {
        for (int i = 0; i < 3; i++)
        {
            int in = (i + 1) % 3;
            // get the vertices in edge
            int v = t(f)[i];
            int vn = t(f)[in];

            // for each face that use v
            for (int j = 0; j < static_cast<int>(vt[v].size()); j++)
            {
                // check if face has vn too and is not f
                int af = vt[v][j];

                if (af != f)
                {
                    for (int k = 0; k < 3; k++)
                    {
                        if (t(af)[k] == vn)
                        {
                            ae(f).push_back(af);
                        }
                    }
                }
            }
        }
    }

    debugf(("Done in %gs", time.GetElapsed()));
    return 1;
}

#endif