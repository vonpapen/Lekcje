using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp7
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void zmiana()
        {
            panel1.BackColor = Color.FromArgb(trackBar1.Value, trackBar2.Value, trackBar3.Value);
        }


        private void trackBar1_ValueChanged(object sender, EventArgs e)
        {
            zmiana();
        }

        private void trackBar2_ValueChanged(object sender, EventArgs e)
        {
            zmiana();
        }

        private void trackBar3_ValueChanged(object sender, EventArgs e)
        {
            zmiana();
        }
    }
}
