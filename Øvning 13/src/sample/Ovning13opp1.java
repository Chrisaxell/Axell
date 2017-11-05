package sample;
import java.awt.*;
import javax.swing.*;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;

public class Ovning13opp1 extends GLCanvas implements GLEventListener {

   private static String TITLE = "Ovning 13!!! del 1";
   private static final int CANVAS_WIDTH = 1080;
   private static final int CANVAS_HEIGHT = 540;

   private GLU glu;

   public Ovning13opp1() {
      this.addGLEventListener(this);
   }

   public void init(GLAutoDrawable drawable) {
      GL2 gl = drawable.getGL().getGL2();
      glu = new GLU();
      gl.glClearColor(0.0f, 5.0f, 5.0f, 0.0f);
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

      gl.glTranslatef(-16.0f, 5.0f, -20.0f);

      gl.glBegin(GL2.GL_POINT);
         gl.glVertex3d(0.0, 2.0, 0.0);
         gl.glVertex3d(1.5, 1.5, 0.0);
         gl.glVertex3d(2.0, 0.0, 0.0);
         gl.glVertex3d(1.5, -1.5, 0.0);
         gl.glVertex3d(0.0, -2.0, 0.0);
         gl.glVertex3d(-1.5, -1.5, 0.0);
         gl.glVertex3d(-2.0, 0.0, 0.0);
         gl.glVertex3d(-1.5, 1.5, 0.0);
      gl.glEnd();

       gl.glTranslatef(5.0f, 0.0f, 0.0f);

      gl.glBegin(GL2.GL_LINES);
         gl.glVertex3d(0.0, 2.0, 0.0);
         gl.glVertex3d(1.5, 1.5, 0.0);
         gl.glVertex3d(2.0, 0.0, 0.0);
         gl.glVertex3d(1.5, -1.5, 0.0);
         gl.glVertex3d(0.0, -2.0, 0.0);
         gl.glVertex3d(-1.5, -1.5, 0.0);
         gl.glVertex3d(-2.0, 0.0, 0.0);
         gl.glVertex3d(-1.5, 1.5, 0.0);
      gl.glEnd();

       gl.glTranslatef(5.0f, 0.0f, 0.0f);

      gl.glBegin(GL2.GL_LINE_STRIP);
         gl.glVertex3d(0.0, 2.0, 0.0);
         gl.glVertex3d(1.5, 1.5, 0.0);
         gl.glVertex3d(2.0, 0.0, 0.0);
         gl.glVertex3d(1.5, -1.5, 0.0);
         gl.glVertex3d(0.0, -2.0, 0.0);
         gl.glVertex3d(-1.5, -1.5, 0.0);
         gl.glVertex3d(-2.0, 0.0, 0.0);
         gl.glVertex3d(-1.5, 1.5, 0.0);
      gl.glEnd();

       gl.glTranslatef(5.0f, 0.0f, 0.0f);

      gl.glBegin(GL2.GL_LINE_LOOP);
         gl.glVertex3d(0.0, 2.0, 0.0);
         gl.glVertex3d(1.5, 1.5, 0.0);
         gl.glVertex3d(2.0, 0.0, 0.0);
         gl.glVertex3d(1.5, -1.5, 0.0);
         gl.glVertex3d(0.0, -2.0, 0.0);
         gl.glVertex3d(-1.5, -1.5, 0.0);
         gl.glVertex3d(-2.0, 0.0, 0.0);
         gl.glVertex3d(-1.5, 1.5, 0.0);
      gl.glEnd();

       gl.glTranslatef(5.0f, 0.0f, 0.0f);

      gl.glBegin(GL2.GL_TRIANGLES);
         gl.glVertex3d(0.0, 2.0, 0.0);
         gl.glVertex3d(1.5, 1.5, 0.0);
         gl.glVertex3d(2.0, 0.0, 0.0);
         gl.glVertex3d(1.5, -1.5, 0.0);
         gl.glVertex3d(0.0, -2.0, 0.0);
         gl.glVertex3d(-1.5, -1.5, 0.0);
         gl.glVertex3d(-2.0, 0.0, 0.0);
         gl.glVertex3d(-1.5, 1.5, 0.0);
      gl.glEnd();

       gl.glTranslatef(5.0f, 0.0f, 0.0f);

      gl.glBegin(GL2.GL_TRIANGLE_STRIP);
         gl.glVertex3d(0.0, 2.0, 0.0);
         gl.glVertex3d(1.5, 1.5, 0.0);
         gl.glVertex3d(2.0, 0.0, 0.0);
         gl.glVertex3d(1.5, -1.5, 0.0);
         gl.glVertex3d(0.0, -2.0, 0.0);
         gl.glVertex3d(-1.5, -1.5, 0.0);
         gl.glVertex3d(-2.0, 0.0, 0.0);
         gl.glVertex3d(-1.5, 1.5, 0.0);
      gl.glEnd();

       gl.glTranslatef(0.0f, -5.0f, 0.0f);

      gl.glBegin(GL2.GL_TRIANGLE_FAN);
         gl.glVertex3d(0.0, 2.0, 0.0);
         gl.glVertex3d(1.5, 1.5, 0.0);
         gl.glVertex3d(2.0, 0.0, 0.0);
         gl.glVertex3d(1.5, -1.5, 0.0);
         gl.glVertex3d(0.0, -2.0, 0.0);
         gl.glVertex3d(-1.5, -1.5, 0.0);
         gl.glVertex3d(-2.0, 0.0, 0.0);
         gl.glVertex3d(-1.5, 1.5, 0.0);
      gl.glEnd();

       gl.glTranslatef( -5.0f, 0.0f, 0.0f);

      gl.glBegin(GL2.GL_TRIANGLES);
         gl.glVertex3d(0.0, 2.0, 0.0);
         gl.glVertex3d(1.5, 1.5, 0.0);
         gl.glVertex3d(2.0, 0.0, 0.0);
         gl.glVertex3d(1.5, -1.5, 0.0);
         gl.glVertex3d(0.0, -2.0, 0.0);
         gl.glVertex3d(-1.5, -1.5, 0.0);
         gl.glVertex3d(-2.0, 0.0, 0.0);
         gl.glVertex3d(-1.5, 1.5, 0.0);
      gl.glEnd();

       gl.glTranslatef(-5.0f, 0.0f, 0.0f);

      gl.glBegin(GL2.GL_QUADS);
         gl.glVertex3d(0.0, 2.0, 0.0);
         gl.glVertex3d(1.5, 1.5, 0.0);
         gl.glVertex3d( 2.0, 0.0, 0.0);
         gl.glVertex3d(1.5, -1.5, 0.0);
         gl.glVertex3d(0.0, -2.0, 0.0);
         gl.glVertex3d(-1.5, -1.5, 0.0);
         gl.glVertex3d(-2.0, 0.0, 0.0);
         gl.glVertex3d(-1.5, 1.5, 0.0);
      gl.glEnd();

       gl.glTranslatef(-5.0f, 0.0f, 0.0f);

      gl.glBegin(GL2.GL_QUAD_STRIP);
         gl.glVertex3d(0.0, 2.0, 0.0);
         gl.glVertex3d(1.5, 1.5, 0.0);
         gl.glVertex3d(2.0, 0.0, 0.0);
         gl.glVertex3d(1.5, -1.5, 0.0);
         gl.glVertex3d(0.0, -2.0, 0.0);
         gl.glVertex3d(-1.5, -1.5, 0.0);
         gl.glVertex3d(-2.0, 0.0, 0.0);
         gl.glVertex3d(-1.5, 1.5, 0.0);
      gl.glEnd();

       gl.glTranslatef(-5.0f, 0.0f, 0.0f);

      gl.glBegin(GL2.GL_POLYGON);
         gl.glVertex3d(0.0, 2.0, 0.0);
         gl.glVertex3d(1.5, 1.5, 0.0);
         gl.glVertex3d(2.0, 0.0, 0.0);
         gl.glVertex3d(1.5, -1.5, 0.0);
         gl.glVertex3d(0.0, -2.0, 0.0);
         gl.glVertex3d(-1.5, -1.5, 0.0);
         gl.glVertex3d(-2.0, 0.0, 0.0);
         gl.glVertex3d(-1.5, 1.5, 0.0);
      gl.glEnd();

       gl.glTranslatef(10.0f, -5.0f, 0.0f);
       gl.glColor3d(0.0f,1.0f,1.0f);

       gl.glBegin(GL2.GL_POINT);
       gl.glVertex3d(0.0, 2.0, 0.0);
       gl.glVertex3d(1.5, 1.5, 0.0);
       gl.glVertex3d(2.0, 0.0, 0.0);
       gl.glVertex3d(1.5, -1.5, 0.0);
       gl.glVertex3d(0.0, -2.0, 0.0);
       gl.glVertex3d(-1.5, -1.5, 0.0);
       gl.glVertex3d(-2.0, 0.0, 0.0);
       gl.glVertex3d(-1.5, 1.5, 0.0);
       gl.glEnd();
   }

   public void dispose(GLAutoDrawable drawable) { }



   public static void main(String[] args) {
       GLCanvas canvas = new Ovning13opp1();
       canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
       
       final JFrame frame = new JFrame();
       frame.getContentPane().add(canvas);
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       frame.setTitle(TITLE);
       frame.pack();
       frame.setVisible(true);      
   }
}
