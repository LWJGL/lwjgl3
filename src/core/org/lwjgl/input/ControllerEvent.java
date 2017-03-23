/*
 * Copyright (c) 2002-2008 LWJGL Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of 'LWJGL' nor the names of
 *   its contributors may be used to endorse or promote products derived
 *   from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.lwjgl.input;

/**
 * An event occuring on a controller.
 *
 * @author Kevin Glass
 */
class ControllerEvent {
	/** Indicates the event was caused by a button */
	public static final int BUTTON = 1;
	/** Indicates the event was caused by a axis */
	public static final int AXIS = 2;
	/** Indicates the event was caused by a pov X */
	public static final int POVX = 3;
	/** Indicates the event was caused by a pov Y */
	public static final int POVY = 4;

	/** The controller generating the event */
	private Controller source;
	/** The index of the input (axis or button) that generated the event */
	private int index;
	/** Type of control that generated the event */
	private int type;
	/** True when a button is pressed, if this event was caused by the button */
	private boolean buttonState;
	/** True if this event was caused by the x axis */
	private boolean xaxis;
	/** True if this event was caused by the y axis */
	private boolean yaxis;
	/** The time stamp of this event */
	private long timeStamp;
	/** The value on a specified axis, if this event was caused by the x-axis */
	private float xaxisValue;
	/** The value on a specified axis, if this event was caused by the y-axis */
	private float yaxisValue;

	/**
	 * Create a new event
	 *
	 * @param source The source of the event
	 * @param timeStamp The time stamp given for this event
	 * @param type The type of control generating this event
	 * @param index The index of the input that generated the event
	 * @param xaxis True if this event was caused by the x-axis
	 * @param yaxis True if this event was caused by the y-axis
	 */
	ControllerEvent(Controller source, long timeStamp, int type, int index, boolean xaxis, boolean yaxis) {
		this(source, timeStamp, type, index, false, xaxis, yaxis, 0, 0);
	}

	/**
	 * Create a new event
	 *
	 * @param source The source of the event
	 * @param timeStamp The time stamp given for this event
	 * @param type The type of control generating this event
	 * @param index The index of the input that generated the event
	 * @param buttonState True when a button is pressed, if this event was caused by the button
	 * @param xaxis True if this event was caused by the x-axis
	 * @param yaxis True if this event was caused by the y-axis
	 * @param xaxisValue The value on a specified axis, if this event was caused by the x-axis
	 * @param yaxisValue The value on a specified axis, if this event was caused by the y-axis
	 */
	ControllerEvent(Controller source, long timeStamp, int type, int index, boolean buttonState, boolean xaxis, boolean yaxis, float xaxisValue, float yaxisValue) {
		this.source = source;
		this.timeStamp = timeStamp;
		this.type = type;
		this.index = index;
		this.buttonState = buttonState;
		this.xaxis = xaxis;
		this.yaxis = yaxis;
		this.xaxisValue = xaxisValue;
		this.yaxisValue = yaxisValue;
	}

	/**
	 * Get the time stamp given for this event. As with nanoTime()
	 * this value means nothing other than giving ordering
	 *
	 * @return The time stamp given for this event
	 */
	public long getTimeStamp() {
		return timeStamp;
	}

	/**
	 * Get the controller that generated this event
	 *
	 * @return The controller that generated this event
	 */
	public Controller getSource() {
		return source;
	}

	/**
	 * Get the index of the control generating this event
	 *
	 * @return The index of the control generating this event
	 */
	public int getControlIndex() {
		return index;
	}

	/**
	 * Check if this event was generated by a button
	 *
	 * @return True if this event was generated by a button
	 */
	public boolean isButton() {
		return type == BUTTON;
	}

	/**
	 * Check the button is pressed or not, when this event was caused
	 *  
	 * @return True when a button is pressed, if this event was caused by the button
	 */
	public boolean getButtonState() {
		return buttonState;
	}

	/**
	 * Check if this event was generated by a axis
	 *
	 * @return True if this event was generated by a axis
	 */
	public boolean isAxis() {
		return type == AXIS;
	}

	/**
	 * Check if this event was generated by a pov
	 *
	 * @return True if this event was generated by a pov
	 */
	public boolean isPovY() {
		return type == POVY;
	}
	/**
	 *
	 * Check if this event was generated by a pov
	 *
	 * @return True if this event was generated by a pov
	 */
	public boolean isPovX() {
		return type == POVX;
	}

	/**
	 * Check if this event was caused by the X axis
	 *
	 * @return True if this event was caused by the X axis
	 */
	public boolean isXAxis() {
		return xaxis;
	}

	/**
	 * Check if this event was caused by the Y axis
	 *
	 * @return True if this event was caused by the Y axis
	 */
	public boolean isYAxis() {
		return yaxis;
	}
	
	/**
	 * Get the value on an X axis when this event was caused
	 *  
	 * @return The value on a specified axis, if this event was caused by the x-axis
	 */
	public float getXAxisValue() {
		return xaxisValue;
	}

	/**
	 * Get the value on an Y axis when this event was caused
	 *  
	 * @return The value on a specified axis, if this event was caused by the y-axis
	 */
	public float getYAxisValue() {
		return yaxisValue;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "["+source+" type="+type+" xaxis="+xaxis+" yaxis="+yaxis+"]";
	}
}
