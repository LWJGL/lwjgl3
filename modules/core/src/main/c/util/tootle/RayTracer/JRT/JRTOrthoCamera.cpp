/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#include "JRTCommon.h"
#include "TootlePCH.h"
#include "JRTCommon.h"
#include "JRTOrthoCamera.h"

JRTOrthoCamera::JRTOrthoCamera(const Vec3f& rPosition, const Vec3f& rDirection, const Vec3f& rUp, float fHorizontalSize)
    : m_position(rPosition), m_direction(rDirection), m_fSize(fHorizontalSize), m_fAspect(1)
{
    m_right = Normalize(Cross(rUp, m_direction));
    m_up = Normalize(Cross(m_direction, m_right));
}


void JRTOrthoCamera::GetRay(float s, float t, Vec3f* origin, Vec3f* delta) const
{
    *delta = Normalize(m_direction);

    // map s,t into -0.5 to 0.5 space, and invert t
    s -= 0.5f;
    t -= 0.5f;
    t *= -1;

    // use that to compute offsets from camera origin
    Vec3f dx = m_right * (s * m_fSize);
    Vec3f dy = m_up * (t * m_fSize * m_fAspect);
    *origin = m_position + dx + dy;

}


void JRTOrthoCamera::ProjectPoint(const Vec3f& /*pt*/, float* /*s*/, float* /*t*/) const
{
    // TODO
    JRT_ASSERT(false);
}