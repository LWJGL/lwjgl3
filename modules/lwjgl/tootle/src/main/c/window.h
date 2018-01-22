/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef WINDOW_H
#define WINDOW_H
/* -------------------------------------------------------------------------*\
* This is an abstraction over a window canvas.
\* -------------------------------------------------------------------------*/

// mouse buttons
enum {M_LEFT, M_MIDDLE, M_RIGHT};
// button state
enum {M_UP, M_DOWN, M_DOUBLE};
// modifiers
enum {M_NORMAL, M_CONTROL, M_SHIFT};

class Window
{
public:
    Window() { w = 0; h = 0; }
    virtual ~Window(void) { ; }
    // Callbacks
    // Called uppon window creation
    virtual int Create(void) { return 1; }
    // Called uppon window destruction
    virtual void Destroy(void) { ; }
    // Called when canvas need redraw
    virtual int Display(void) { return 1; }
    // Called when computer is idle.
    virtual void Idle(void) { ; }
    // Called when canvas is reshaped.
    virtual void Reshape(int w, int h) { this->w = w; this->h = h; }
    // called when mouse moves
    virtual void Motion(int x, int y, int modifier)
    { (void) x; (void) y; (void) modifier; }
    // Called when mouse button is pressed or released
    virtual void Button(int button, int state, int x, int y, int modifier)
    { (void) button; (void) state; (void) x; (void) y; }
    // Called when key is pressed
    virtual void Keyboard(unsigned char c, int x, int y)
    { (void) c; (void) x; (void) y; }
    virtual int GetWidth(void) { return w; }
    virtual int GetHeight(void) { return h; }
private:
    int w, h;
};

#endif // WINDOW_H
