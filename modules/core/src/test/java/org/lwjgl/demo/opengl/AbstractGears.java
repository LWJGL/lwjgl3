/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */

package org.lwjgl.demo.opengl;

import org.lwjgl.BufferUtils;

import java.nio.FloatBuffer;

import static org.lwjgl.opengl.GL11.*;

/**
 * This is the OpenGL "standard" Gears demo, originally by Brian Paul
 *
 * @author Brian Matzon <brian@matzon.dk>
 */
public abstract class AbstractGears {

	private static final float view_rotx = 20.0f;

	private static final float view_roty = 30.0f;

	private float view_rotz;

	private int gear1;

	private int gear2;

	private int gear3;

	private float angle;

	public void execute() {
		try {
			init();
			initGLState();

			loop();
		} finally {
			try {
				destroy();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	protected abstract void init();

	protected abstract void loop();

	protected abstract void destroy();

	protected void initGLState() {
		System.err.println("GL_VENDOR: " + glGetString(GL_VENDOR));
		System.err.println("GL_RENDERER: " + glGetString(GL_RENDERER));
		System.err.println("GL_VERSION: " + glGetString(GL_VERSION));

		// setup ogl
		FloatBuffer pos = BufferUtils.createFloatBuffer(4).put(new float[] { 5.0f, 5.0f, 10.0f, 0.0f });
		FloatBuffer red = BufferUtils.createFloatBuffer(4).put(new float[] { 0.8f, 0.1f, 0.0f, 1.0f });
		FloatBuffer green = BufferUtils.createFloatBuffer(4).put(new float[] { 0.0f, 0.8f, 0.2f, 1.0f });
		FloatBuffer blue = BufferUtils.createFloatBuffer(4).put(new float[] { 0.2f, 0.2f, 1.0f, 1.0f });

		pos.flip();
		red.flip();
		green.flip();
		blue.flip();

		glLightfv(GL_LIGHT0, GL_POSITION, pos);
		glEnable(GL_CULL_FACE);
		glEnable(GL_LIGHTING);
		glEnable(GL_LIGHT0);
		glEnable(GL_DEPTH_TEST);

		/* make the gears */
		gear1 = glGenLists(1);
		glNewList(gear1, GL_COMPILE);
		glMaterialfv(GL_FRONT, GL_AMBIENT_AND_DIFFUSE, red);
		gear(1.0f, 4.0f, 1.0f, 20, 0.7f);
		glEndList();

		gear2 = glGenLists(1);
		glNewList(gear2, GL_COMPILE);
		glMaterialfv(GL_FRONT, GL_AMBIENT_AND_DIFFUSE, green);
		gear(0.5f, 2.0f, 2.0f, 10, 0.7f);
		glEndList();

		gear3 = glGenLists(1);
		glNewList(gear3, GL_COMPILE);
		glMaterialfv(GL_FRONT, GL_AMBIENT_AND_DIFFUSE, blue);
		gear(1.3f, 2.0f, 0.5f, 10, 0.7f);
		glEndList();

		glEnable(GL_NORMALIZE);

		glMatrixMode(GL_PROJECTION);

		float h = (float)300 / (float)300;
		glFrustum(-1.0f, 1.0f, -h, h, 5.0f, 60.0f);
		glMatrixMode(GL_MODELVIEW);
		glLoadIdentity();
		glTranslatef(0.0f, 0.0f, -40.0f);
	}

	protected void renderLoop() {
		angle += 2.0f;

		glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

		glPushMatrix();
		glRotatef(view_rotx, 1.0f, 0.0f, 0.0f);
		glRotatef(view_roty, 0.0f, 1.0f, 0.0f);
		glRotatef(view_rotz, 0.0f, 0.0f, 1.0f);

		glPushMatrix();
		glTranslatef(-3.0f, -2.0f, 0.0f);
		glRotatef(angle, 0.0f, 0.0f, 1.0f);
		glCallList(gear1);
		glPopMatrix();

		glPushMatrix();
		glTranslatef(3.1f, -2.0f, 0.0f);
		glRotatef(-2.0f * angle - 9.0f, 0.0f, 0.0f, 1.0f);
		glCallList(gear2);
		glPopMatrix();

		glPushMatrix();
		glTranslatef(-3.1f, 4.2f, 0.0f);
		glRotatef(-2.0f * angle - 25.0f, 0.0f, 0.0f, 1.0f);
		glCallList(gear3);
		glPopMatrix();

		glPopMatrix();
	}

	/**
	 * Draw a gear wheel.  You'll probably want to call this function when
	 * building a display list since we do a lot of trig here.
	 *
	 * @param inner_radius radius of hole at center
	 * @param outer_radius radius at center of teeth
	 * @param width        width of gear
	 * @param teeth        number of teeth
	 * @param tooth_depth  depth of tooth
	 */
	private static void gear(float inner_radius, float outer_radius, float width, int teeth, float tooth_depth) {
		int i;
		float r0, r1, r2;
		float angle, da;
		float u, v, len;

		r0 = inner_radius;
		r1 = outer_radius - tooth_depth / 2.0f;
		r2 = outer_radius + tooth_depth / 2.0f;

		da = 2.0f * (float)Math.PI / teeth / 4.0f;

		glShadeModel(GL_FLAT);

		glNormal3f(0.0f, 0.0f, 1.0f);

		/* draw front face */
		glBegin(GL_QUAD_STRIP);
		for ( i = 0; i <= teeth; i++ ) {
			angle = i * 2.0f * (float)Math.PI / teeth;
			glVertex3f(r0 * (float)Math.cos(angle), r0 * (float)Math.sin(angle), width * 0.5f);
			glVertex3f(r1 * (float)Math.cos(angle), r1 * (float)Math.sin(angle), width * 0.5f);
			if ( i < teeth ) {
				glVertex3f(r0 * (float)Math.cos(angle), r0 * (float)Math.sin(angle), width * 0.5f);
				glVertex3f(r1 * (float)Math.cos(angle + 3.0f * da), r1 * (float)Math.sin(angle + 3.0f * da),
				           width * 0.5f);
			}
		}
		glEnd();

		/* draw front sides of teeth */
		glBegin(GL_QUADS);
		for ( i = 0; i < teeth; i++ ) {
			angle = i * 2.0f * (float)Math.PI / teeth;
			glVertex3f(r1 * (float)Math.cos(angle), r1 * (float)Math.sin(angle), width * 0.5f);
			glVertex3f(r2 * (float)Math.cos(angle + da), r2 * (float)Math.sin(angle + da), width * 0.5f);
			glVertex3f(r2 * (float)Math.cos(angle + 2.0f * da), r2 * (float)Math.sin(angle + 2.0f * da), width * 0.5f);
			glVertex3f(r1 * (float)Math.cos(angle + 3.0f * da), r1 * (float)Math.sin(angle + 3.0f * da), width * 0.5f);
		}
		glEnd();

		/* draw back face */
		glBegin(GL_QUAD_STRIP);
		for ( i = 0; i <= teeth; i++ ) {
			angle = i * 2.0f * (float)Math.PI / teeth;
			glVertex3f(r1 * (float)Math.cos(angle), r1 * (float)Math.sin(angle), -width * 0.5f);
			glVertex3f(r0 * (float)Math.cos(angle), r0 * (float)Math.sin(angle), -width * 0.5f);
			glVertex3f(r1 * (float)Math.cos(angle + 3 * da), r1 * (float)Math.sin(angle + 3 * da), -width * 0.5f);
			glVertex3f(r0 * (float)Math.cos(angle), r0 * (float)Math.sin(angle), -width * 0.5f);
		}
		glEnd();

		/* draw back sides of teeth */
		glBegin(GL_QUADS);
		for ( i = 0; i < teeth; i++ ) {
			angle = i * 2.0f * (float)Math.PI / teeth;
			glVertex3f(r1 * (float)Math.cos(angle + 3 * da), r1 * (float)Math.sin(angle + 3 * da), -width * 0.5f);
			glVertex3f(r2 * (float)Math.cos(angle + 2 * da), r2 * (float)Math.sin(angle + 2 * da), -width * 0.5f);
			glVertex3f(r2 * (float)Math.cos(angle + da), r2 * (float)Math.sin(angle + da), -width * 0.5f);
			glVertex3f(r1 * (float)Math.cos(angle), r1 * (float)Math.sin(angle), -width * 0.5f);
		}
		glEnd();

		/* draw outward faces of teeth */
		glBegin(GL_QUAD_STRIP);
		for ( i = 0; i < teeth; i++ ) {
			angle = i * 2.0f * (float)Math.PI / teeth;
			glVertex3f(r1 * (float)Math.cos(angle), r1 * (float)Math.sin(angle), width * 0.5f);
			glVertex3f(r1 * (float)Math.cos(angle), r1 * (float)Math.sin(angle), -width * 0.5f);
			u = r2 * (float)Math.cos(angle + da) - r1 * (float)Math.cos(angle);
			v = r2 * (float)Math.sin(angle + da) - r1 * (float)Math.sin(angle);
			len = (float)Math.sqrt(u * u + v * v);
			u /= len;
			v /= len;
			glNormal3f(v, -u, 0.0f);
			glVertex3f(r2 * (float)Math.cos(angle + da), r2 * (float)Math.sin(angle + da), width * 0.5f);
			glVertex3f(r2 * (float)Math.cos(angle + da), r2 * (float)Math.sin(angle + da), -width * 0.5f);
			glNormal3f((float)Math.cos(angle), (float)Math.sin(angle), 0.0f);
			glVertex3f(r2 * (float)Math.cos(angle + 2 * da), r2 * (float)Math.sin(angle + 2 * da), width * 0.5f);
			glVertex3f(r2 * (float)Math.cos(angle + 2 * da), r2 * (float)Math.sin(angle + 2 * da), -width * 0.5f);
			u = r1 * (float)Math.cos(angle + 3 * da) - r2 * (float)Math.cos(angle + 2 * da);
			v = r1 * (float)Math.sin(angle + 3 * da) - r2 * (float)Math.sin(angle + 2 * da);
			glNormal3f(v, -u, 0.0f);
			glVertex3f(r1 * (float)Math.cos(angle + 3 * da), r1 * (float)Math.sin(angle + 3 * da), width * 0.5f);
			glVertex3f(r1 * (float)Math.cos(angle + 3 * da), r1 * (float)Math.sin(angle + 3 * da), -width * 0.5f);
			glNormal3f((float)Math.cos(angle), (float)Math.sin(angle), 0.0f);
		}
		glVertex3f(r1 * (float)Math.cos(0), r1 * (float)Math.sin(0), width * 0.5f);
		glVertex3f(r1 * (float)Math.cos(0), r1 * (float)Math.sin(0), -width * 0.5f);
		glEnd();

		glShadeModel(GL_SMOOTH);

		/* draw inside radius cylinder */
		glBegin(GL_QUAD_STRIP);
		for ( i = 0; i <= teeth; i++ ) {
			angle = i * 2.0f * (float)Math.PI / teeth;
			glNormal3f(-(float)Math.cos(angle), -(float)Math.sin(angle), 0.0f);
			glVertex3f(r0 * (float)Math.cos(angle), r0 * (float)Math.sin(angle), -width * 0.5f);
			glVertex3f(r0 * (float)Math.cos(angle), r0 * (float)Math.sin(angle), width * 0.5f);
		}
		glEnd();
	}

}