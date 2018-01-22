/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef _JRT_CAMERA_H_
#define _JRT_CAMERA_H_

#include "JRTCommon.h"


class JRTCamera
{
public:
    virtual ~JRTCamera() {};
    virtual void GetRay(float s, float t, Vec3f* origin, Vec3f* delta) const = 0;
    virtual void SetAspectRatio(float aspect)  = 0;

    // returns the position of the given point in camera NDC space
    // if the point is not visible, s and t are each set to -1
    virtual void ProjectPoint(const Vec3f& pt, float* s, float* t) const = 0;
};


class JRTPerspectiveCamera : virtual public JRTCamera
{
public:
    JRTPerspectiveCamera(const Vec3f& position, const Vec3f& direction, const Vec3f& up, float fov = 3.1415926);

    virtual void GetRay(float s, float t, Vec3f* origin, Vec3f* delta) const ;
    virtual void SetAspectRatio(float aspect)  ;

    // returns the position of the given point in camera NDC space
    // if the point is not visible, s and t are each set to -1
    virtual void ProjectPoint(const Vec3f& pt, float* s, float* t) const ;

private:
    float m_aspect;
    Vec3f m_position;    // eye position in world space
    Vec3f m_direction; // viewing axis in world space
    Vec3f m_up;     // "true" up.  Vertical direction in world-space image plane
    Vec3f m_right;  // horizontal direction in world-space image plane

    float m_plane_width;   // size of image plane
    Vec3f m_corner;        // top-left corner of image plane - world space

};


#endif