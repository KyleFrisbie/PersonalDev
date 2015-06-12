using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace FirstProject_BootstrapIntroduction.Controllers
{
    public class HomeController : Controller
    {
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult About()
        {
            ViewBag.Message = "Your application description page.";
            ViewBag.Poop = "Poop.";

            return View();
        }

        public ActionResult Contact()
        {
            ViewBag.Message = "Your contact page.";

            return View();
        }

        public ActionResult Basic()
        {
            return View();
        }

        public ActionResult Advanced()
        {
            var person = new FirstProject_BootstrapIntroduction.Models.Person
            {
                FirstName = "Eric",
                LastName = "McQuiggan"
            };
            return View(person);
        }


    }
}