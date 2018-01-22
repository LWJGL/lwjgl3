/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#include "TootlePCH.h"
#include "JRTCommon.h"
#include "JRTCamera.h"


/// \param position
///     Camera position
/// \param direction
///     Camera direction
/// \param up
///     The 'up' vector
/// \param fov
///     Field of view angle, in radians

JRTPerspectiveCamera::JRTPerspectiveCamera(const Vec3f& position, const Vec3f& direction, const Vec3f& up, float fov)
    : m_position(position),
      m_direction(direction)
{
    m_right = Cross(up, direction);
    m_up = Cross(direction, m_right);

    m_right = Normalize(m_right);
    m_up = Normalize(m_up);

    // distance from center of viewing plane to edges
    // assuming a hither distance of 1, it is:  tan(fov/2.0)
    // draw a diagram if you're curious
    m_plane_width = tan(fov / 2.0f);


    Vec3f H = m_right * m_plane_width;
    Vec3f V = m_up * m_plane_width;
    Vec3f center = m_position + m_direction;

    // get the pixel center on the top-left corner of the image plane
    m_corner = center - H;
    m_corner = m_corner + V;

    m_plane_width *= 2.0;
    m_aspect = 1;
}


void JRTPerspectiveCamera::SetAspectRatio(float aspect)
{
    // recompute 'corner' position for sampling
    Vec3f center = m_position + m_direction;
    Vec3f H = m_right * (m_plane_width / 2.0f) * aspect;
    Vec3f V = m_up * (m_plane_width / 2.0f);

    m_corner = center - H;
    m_corner = m_corner + V;
    m_aspect = aspect;
}

void JRTPerspectiveCamera::GetRay(float s, float t, Vec3f* origin, Vec3f* delta) const
{
    // correct for aspect ratio
    s *= m_aspect;

    s *= m_plane_width;
    t *= m_plane_width;
    Vec3f pixel_center = m_corner + (m_right * s) + (m_up * -t);
    Vec3f dir = (pixel_center - m_position);

    *origin = m_position;
    *delta = dir;

}


void JRTPerspectiveCamera::ProjectPoint(const Vec3f& pt, float* s, float* t) const
{
    // convert point to camera space
    Vec3f pcam = pt - m_position;
    Vec3f camera_space_pt = (m_right * pcam.x) + (m_up * pcam.y) + (m_direction * pcam.z);

    if (camera_space_pt.z <= 0.0)
    {
        *s = -1;
        *t = -1;
        return;
    }

    // splat point onto image plane and find out where it lands
    // we are looking for a vector such that z=1
    float val = 1.0f / camera_space_pt.z;
    Vec3f splat;
    splat.x = val * camera_space_pt.x;
    splat.y = val * camera_space_pt.y;
    splat.z = 1;

    // normalize to size of image plane and clip
    splat.x /= m_plane_width;
    splat.y /= -m_plane_width;

    if (std::abs(splat.x) > 0.5 || std::abs(splat.y) > 0.5)
    {
        *s = -1;
        *t = -1;
        return;
    }

    // correct for aspect ratio and convert to NDC space
    splat.x /= m_aspect;
    splat.x += 0.5;
    splat.y += 0.5;
    *s = splat.x;
    *t = splat.y;

}

