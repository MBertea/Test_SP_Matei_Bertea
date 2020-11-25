package Commands;

import Produse.Lichide;
import Produse.Mancare;

public interface Visitor<type> {
    type visitMancare(Mancare mancare);
    type visitLichide(Lichide lichide);
}
