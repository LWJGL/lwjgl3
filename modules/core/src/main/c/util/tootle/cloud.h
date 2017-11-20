/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef CLOUD_H
#define CLOUD_H

#include "vector.h"
#include "color.h"

class Cloud
{
public:
    // default constructor
    Cloud(void)
    {
    }

    // destructor
    virtual ~Cloud()
    {
    }

    // vertex access functions
    const Vector3& v(int i) const { return pv[i]; }
    Vector3& v(int i) { return pv[i]; }
    // vertex std::vector access functions
    std::vector<Vector3>& v(void) { return pv; }
    const std::vector<Vector3>& v(void) const { return pv; }
    void v (const std::vector<Vector3>& new_v) { pv = new_v; }
    // normal access functions
    const Vector3& n(int i) const { return (pn)[i]; }
    Vector3& n(int i) { return (pn)[i]; }
    // normal std::vector access functions
    std::vector<Vector3>& n(void) { return pn; }
    const std::vector<Vector3>& n(void) const { return pn; }
    void n (const std::vector<Vector3>& new_n) { pn = new_n; }
    // color access functions
    const Color& c(int i) const { return pc[i]; }
    Color& c(int i) { return pc[i]; }
    // color std::vector access functions
    std::vector<Color>& c(void) { return pc; }
    const std::vector<Color>& c(void) const { return pc; }
    void c (const std::vector<Color>& new_c) { pc = new_c; }
    // vertex confidence access functions
    float vc(int i) const { return pvc[i]; }
    float& vc(int i) { return pvc[i]; }
    // vertex confidence std::vector access functions
    std::vector<float>& vc(void) { return pvc; }
    const std::vector<float>& vc(void) const { return pvc; }
    void vc(const std::vector<float>& new_vc)
    { pvc = new_vc; }
protected:
    std::vector<Vector3> pv; // vertices
    std::vector<Vector3> pn; // normals
    std::vector<Color> pc;   // colors
    std::vector<float> pvc;  // vertex confidence
private:
    // prevent copy constructors and assignments
    Cloud (const Cloud& other);
    Cloud& operator=(const Cloud& other);
};

#endif
