package sample;
import java.awt.*;
import javax.swing.*;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.gl2.GLUT;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ovning14 extends GLCanvas implements GLEventListener {

    private static String TITLE = "Ovning 13!!! del 1";
    private static final int CANVAS_WIDTH = 1400;
    private static final int CANVAS_HEIGHT = 1400;
    GLUT glut = new GLUT();

    // angle of rotation for the camera direction
    float angle=0.0f;
    // actual vector representing the camera's direction
    float lx=0.0f,lz=-1.0f;
    // XZ position of the camera
    double x=0.0f,z=0.0f;
    float front = 0;
    float side = 0;

    double rotAngle = 0;
    double left = 0, hoyre=0;

    double a= 0;
    double b=0;

    private GLU glu;

    public Ovning14() {
        this.addGLEventListener(this);
        this.addKeyListener(new RotateKeyListener());
    }

    public void drawHode(GL2 gl){

        int f = 20;

        gl.glPushMatrix();
        gl.glColor3d(1,1,1);
        glut.glutSolidSphere(4,f,f);//hode
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0,4,0);
        gl.glTranslatef(-1.7f,0.86f,2.87f);
        glut.glutSolidSphere(1,f,f); //venstre øyne
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0,4,0);
        gl.glTranslatef(1.7f,0.86f,2.87f);
        glut.glutSolidSphere(1,f,f); //høyre øyne
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(1,1,1);
        gl.glTranslatef(-1.7f,0.86f,2.87f+1);
        glut.glutSolidSphere(0.25,f,f); //venstre puppil
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(1,1,1);
        gl.glTranslatef(1.7f,0.86f,2.87f+1);
        glut.glutSolidSphere(0.25,f,f); // høyre puppil
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glColor3d(0,0,0);
        gl.glScalef(2,1,1);
        gl.glTranslatef(0,-0.45f,3.55f);
        glut.glutSolidCube(1);
        gl.glPopMatrix();

    }


    public void drawKropp(GL2 gl){


        gl.glColor3d(1,1,1);
        float a = 0.3f;

        gl.glPushMatrix();
        gl.glScalef(0.4f,3,0.5f);
        glut.glutSolidCube(1); //kroppen
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glScalef(a,3.5f,a);
        gl.glTranslatef(0.7f,0.1f,0);
        glut.glutSolidCube(0.5f); // høyre arm
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glScalef(a,3.5f,a);
        gl.glTranslatef(-0.7f,0.1f,0);
        glut.glutSolidCube(0.5f); // venstre arm
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glScalef(a,3.5f,a);
        gl.glTranslatef(0.3f,-0.6f,0);
        glut.glutSolidCube(0.5f); // høyre bein
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glScalef(a,3.5f,a);
        gl.glTranslatef(-0.3f,-0.6f,0);
        glut.glutSolidCube(0.5f); // venstre bein
        gl.glPopMatrix();
    }

    public void drawJens(GL2 gl){
        gl.glPushMatrix();
        gl.glPushMatrix();
        gl.glTranslated(0,4.55,0);
        drawHode(gl);
        gl.glPopMatrix();
        gl.glTranslated(0,0,0);
        gl.glScalef(1f,0.4f,1f);
        drawKropp(gl);
        gl.glPopMatrix();
    }

    public void gulv(GL2 gl) {
        gl.glPushMatrix();
        gl.glColor3f(0f, 0f, 0f);
        gl.glBegin(GL2.GL_QUADS);
            gl.glVertex3f(-100.0f, 0.0f, -100.0f);
            gl.glVertex3f(-100.0f, 0.0f,  100.0f);
            gl.glVertex3f( 100.0f, 0.0f,  100.0f);
            gl.glVertex3f( 100.0f, 0.0f, -100.0f);
        gl.glEnd();
        gl.glPopMatrix();
    }

    public void init(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        glu = new GLU();
        gl.glClearColor(0.0f, 6.0f, 6.0f, 6.0f);
        gl.glEnable(GL2.GL_DEPTH_TEST);
        gl.glHint(GL2.GL_PERSPECTIVE_CORRECTION_HINT, GL2.GL_NICEST);
    }


    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL2 gl = drawable.getGL().getGL2();

        if (height == 0) height = 1;
        float aspect = (float)width / height;

        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0, aspect, 0.1, 100.0);

        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity(); // reset
    }

    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();

                glu.gluLookAt(20*b+x,5,20*a+z,x,2,z,0,1,0);
        gl.glPushMatrix();

        glut.glutSolidCube(2);
        gl.glTranslated(x,0,z);
        gl.glRotatef(side,0,1,0);
        gl.glRotatef(4f,0,1,0);
        gl.glRotated(rotAngle, 1, 1, 1);
        drawJens(gl);
        gl.glPopMatrix();
    }

    public void keyPressedX( KeyEvent ke ){
        x++;
    }

    public void kePressedZ( KeyEvent ke ){
        z++;
    }

    public void dispose(GLAutoDrawable drawable) { }

    private class RotateKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if(keyCode == KeyEvent.VK_W) {
                x = x+Math.sin(Math.toRadians(side));
                z = z+Math.cos(Math.toRadians(side));
            } else if(keyCode == KeyEvent.VK_S) {
                x = x-Math.sin(Math.toRadians(side));
                z = z-Math.cos(Math.toRadians(side));
            } else if(keyCode == KeyEvent.VK_A) {
                side += 10;
            } else if(keyCode == KeyEvent.VK_D) {
                side -= 10;
            } else if(keyCode == KeyEvent.VK_LEFT) {
                left += 10;
                a=Math.sin(Math.toRadians(left));
                b=Math.cos(Math.toRadians(left));
            } else if(keyCode == KeyEvent.VK_RIGHT) {
                left -=10;
                a=Math.sin(Math.toRadians(left));
                b=Math.cos(Math.toRadians(left));
            }
            Ovning14.this.repaint();
        }
    }

    public static void main(String[] args) {
        GLCanvas canvas = new Ovning14();
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        final JFrame frame = new JFrame();
        frame.getContentPane().add(canvas);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle(TITLE);
        frame.pack();
        frame.setVisible(true);
    }
}
